package one.zero;

public class SalesCommissions {

    private static final int BASE_PAY = 200;

    public static void determineSalesCommissions(int[] sales, int[] frequency) {

        for(int sale: sales) {
            sale = (int)(0.09 * sale) + BASE_PAY;
            switch (sale / 100) {
                case 2 -> ++frequency[0];
                case 3 -> ++frequency[1];
                case 4 -> ++frequency[2];
                case 5 -> ++frequency[3];
                case 6 -> ++frequency[4];
                case 7 -> ++frequency[5];
                case 8 -> ++frequency[6];
                case 9 -> ++frequency[7];
                default -> ++frequency[8];
            }
        }

    }
}
