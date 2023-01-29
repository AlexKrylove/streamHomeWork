import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Task1
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        findMinMax(numbers);
        //Task2
        getCount(numbers);

    }

    public static void findMinMax(List<Integer> list) {
        System.out.println("Минимальное значение:" + list.stream().min(Integer::compareTo).get());
        System.out.println("Максимальное значение:" + list.stream().max(Integer::compareTo).get());
    }

    public static void getCount(List<Integer> list) {
        System.out.println("В листе " + list.stream().filter(i -> i % 2 == 0).count() + " четных значения");
    }
}

