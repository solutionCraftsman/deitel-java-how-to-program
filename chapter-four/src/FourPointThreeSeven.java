import java.util.Scanner;

public class FourPointThreeSeven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int input = in.nextInt();

        System.out.printf("Factorial: %10f\n", factorial(input));
        System.out.printf("e: %10f\n", e(input));
        System.out.printf("ex: %10f\n", ex(input));
    }

    static double factorial(int input) {
        if(input == 0) {
            return 1;
        }

        int sum = 1;
        for (int valueCount = 1; valueCount <= input; valueCount++) {
            sum *= valueCount;
        }
        return sum;
    }

    static double e(int input) {
        double sum = 1;
        for (int valueCount = 1; valueCount <= input; valueCount++) {
            sum += 1 / factorial(input);
        }
        return sum;
    }

    static double ex(int input) {
        double sum = 1;
        for (int valueCount = 1; valueCount <= input; valueCount++) {
            sum += Math.pow(input, valueCount) / factorial(input);
        }
        return sum;
    }


}
