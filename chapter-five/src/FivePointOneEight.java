import java.util.Scanner;

public class FivePointOneEight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter principal as integer: ");
        int principal = in.nextInt();
        double principalInDollarsAndCents = principal / 100.0;
        int dollarsPartOfPrincipal = principal / 100;
        int centsPartOfPrincipal = principal % 100;

        System.out.printf("$%d = $%.2f = $%d, %d cents%n",
                principal, principalInDollarsAndCents, dollarsPartOfPrincipal, centsPartOfPrincipal);
        FivePointOneFour.calculateCompoundInterest(0.0, principalInDollarsAndCents, 5, 0.0);
    }
}

