package one.six;

public class UsingTheEnhancedForStatement {

    private static double sum;

    public static void main(String... args) {
        sum = 0;
        for (String arg : args) {
            sum += Double.parseDouble(arg);
        }
        System.out.println("Sum of arguments is " + sum);
    }

    public static double getSum() {
        return sum;
    }
}
