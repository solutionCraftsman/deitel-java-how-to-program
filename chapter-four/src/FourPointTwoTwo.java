import java.util.Scanner;

public class FourPointTwoTwo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Nth value? ");
        int nthValue = scn.nextInt();

        System.out.printf("%-5s %-10s %-10s %-10s\n\n", "N", "10*N", "100*N", "1000*N");
        for(int n = 1; n <= nthValue; n++) {
            System.out.printf("%-5d %-10d %-10d %-10d\n", n, 10 * n, 100 * n, 1000 * n);
        }
    }
}
