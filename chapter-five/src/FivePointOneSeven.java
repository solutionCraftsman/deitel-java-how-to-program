import java.util.Scanner;

public class FivePointOneSeven {
    public static void main(String[] args) {
        int productNumber;
        int quantitySold;
        Scanner in = new Scanner(System.in);

        double totalRetailValue = 0.0;
        do {
            System.out.print("Enter Product Number (Enter -1 when all products have been entered): ");
            productNumber = in.nextInt();
            System.out.print("Enter Quantity Sold: (Enter -1 when all products have been entered): ");
            quantitySold = in.nextInt();

            System.out.println();

            totalRetailValue += (getProductPrice(productNumber) * quantitySold);
        } while(productNumber != -1 && quantitySold != -1);

        System.out.printf("Total retail value is %.2f", totalRetailValue);
    }

    private static double getProductPrice(int productNumber) {
        return switch (productNumber) {
            case 1 -> 2.98;
            case 2 -> 4.50;
            case 3 -> 9.98;
            case 4 -> 4.49;
            case 5 -> 6.87;
            default -> 0;
        };
    }
}


/* ToTestWith
1   2.98	5
2	4.5     3
3	9.98	7
4	4.49	5
5	6.87	2
2	4.5	    4
3	9.98	6
4	4.49	7
1	2.98	5
5	6.87	3
5	6.87	2
2	4.5	    4
3	9.98	6
* */

