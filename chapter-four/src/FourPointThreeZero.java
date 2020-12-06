import java.util.Scanner;

//Palindromes
public class FourPointThreeZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        int resultOfDivision;

        boolean inputIsFiveDigits = false;
        do {
            System.out.print("Enter number: ");
            number = in.nextInt();

            //Gbenga's Method - check if it is within the rande 9999 and 99999
            resultOfDivision = number / 10000;
            if(resultOfDivision < 1 || resultOfDivision > 10){
                System.out.println("Only five digits allowed\n");
            }
            else {
                inputIsFiveDigits = true;
            }
        } while (!inputIsFiveDigits);

        //If first != last
        if((number / 10000) != (number % 10)){
            System.out.println(number + " is not a palindrome.");
            return;
        }

        //If second != fourth
        if(((number / 1000) % 10) != ((number % 100) / 10)){
            System.out.println(number + " is not a palindrome.");
            return;
        }

        System.out.println(number + " is a palindrome.");
    }
}
