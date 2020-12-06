import java.util.Scanner;

public class FourPointThreeSix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of longest side: ");
        int longestSide = in.nextInt();
        System.out.print("Enter length of other side: ");
        int secondSide = in.nextInt();
        System.out.print("Enter length of last side: ");
        int thirdSide = in.nextInt();

        if(longestSide == 0 || secondSide == 0 || thirdSide == 0) {
            System.out.println("Invalid Inputs");
            return;
        }

        if(Math.pow(secondSide, 2) + Math.pow(thirdSide, 2) == Math.pow(longestSide, 2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
