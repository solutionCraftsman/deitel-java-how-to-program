package examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysAndStreams {

    public static void main(String[] args) {

        Integer[] values = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6};

        System.out.printf("Original values: %s%n", Arrays.asList(values));
        System.out.printf("Original values: %s%n", Arrays.toString(values));

        // sort values in ascending order with streams
        System.out.printf("Sorted values: %s%n",
                Arrays.stream(values)
                .sorted()
                .collect(Collectors.toList()));

        List<Integer> greaterThan4 = Arrays
                .stream(values)
                .filter(value -> value > 4)
                .collect(Collectors.toList());


    }

}
