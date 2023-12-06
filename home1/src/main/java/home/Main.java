package home;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,324,5,234,5,324,5,234,452,246,345,6,456);
        System.out.println(list);
        System.out.println("Среднее значение чётных чисел : " + list.stream().filter(i -> (i % 2) == 0).mapToInt(e -> e).average().getAsDouble());

    }
}