package examples;

import java.util.stream.IntStream;

public class IntStreamOperations {

    public static void main(String[] args) {

        int[] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

        System.out.println("Original Values");

        IntStream.of(values).forEach(value -> System.out.printf("%d ", value));
        System.out.println();

        System.out.printf("%nCount: %d%n", IntStream.of(values).count());

        System.out.printf("%nMin: %d%n", IntStream.of(values).min().getAsInt());

        System.out.printf("%nMax: %d%n", IntStream.of(values).max().getAsInt());

        System.out.printf("%nSum: %d%n", IntStream.of(values).sum());

        if(IntStream.of(values).average().isPresent()) {
            System.out.printf("%nAverage: %.2f%n", IntStream.of(values).average().getAsDouble());
        }

        // sum of values with reduce method
        System.out.printf("%nSum via reduce method: %d%n",
                IntStream.of(values).reduce(0, (x, y) -> x + y));

        System.out.printf("%nSum via reduce method, method reference: %d%n",
                IntStream.of(values).reduce(0, Integer::sum));

        System.out.printf("%nSum of squares via reduce method: %d%n",
                IntStream.of(values).reduce(0, (x, y) -> (x * x) + (y * y)));

        System.out.printf("%nProduct via reduce method: %d%n",
                IntStream.of(values).reduce(1, (x, y) -> x * y));

        // even values displayed in sorted order
        System.out.printf("%nEven values displayed in sorted order: ");
        IntStream.of(values)
                .filter(value -> value % 2 == 0)
                .sorted()
                .forEach(value -> System.out.printf("%d" , value));
        System.out.println();

        // odd values multiplied by 10 and displayed in sorted order
        IntStream.of(values)
                .filter(value -> value % 2 != 0)
                .map(value -> value * 10)
                .sorted()
                .forEach(value -> System.out.printf("%d ", value));
        System.out.println();

        // sum range of integers from 1 to 10, exlusive
        System.out.printf("%nSum of integers 1 and 10: %d%n",
                IntStream.of(1, 10).sum());

        System.out.printf("%nSum of integers from 1 to 9: %d%n",
                IntStream.range(1, 10).sum());

        // sum range of integers from 1 to 10, inclusive
        System.out.printf("Sum of integers from 1 to 10: %d%n",
                IntStream.rangeClosed(1, 10).sum());


        System.out.println(IntStream.of(values).summaryStatistics());
    }
}
