
public class FivePointTwoZero {

    public static void main(String[] args) {
        double pi = 0.0;

        System.out.printf("%6s%20s%n", "Term", "π");
        for (int denominator = 1, termCounter = 1; denominator < 200_000; denominator += 2, termCounter++) {
            if(termCounter % 2 == 0) {
                pi -= 4.0 / denominator;
                System.out.printf("%6s%20f%n", "-4/" + denominator, pi);
            }
            else {
                pi += 4.0 / denominator;
                System.out.printf("%6s%20f%n", "+4/" + denominator, pi);
            }
        }
    }
}
