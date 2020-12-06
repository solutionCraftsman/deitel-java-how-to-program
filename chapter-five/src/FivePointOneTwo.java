
public class FivePointOneTwo {
    public static void main(String[] args) {
        int sum = 0;
        for (int oddInteger = 1; oddInteger <= 15 ; oddInteger += 2) {
            System.out.print(sum + " + " + oddInteger + " = ");
            sum += oddInteger;
            System.out.println(sum);
        }

        System.out.println(sum);
    }
}
