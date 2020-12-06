
public class FivePointTwoThree {

    public static void main(String[] args) {

        int a = 1;
        int b = 1;
        int g = 1;
        int i = 1;
        int j = 1;
        int x = 1;
        int y = 1;

        System.out.print("Result of Original Expression: ");
        System.out.println(!(x < 5) && !(y >= 7));

        System.out.print("Result of Modified Expression: ");
        //System.out.println((x > 5) || (y < 7));
        System.out.println(!((x < 5) || (y >= 7)));

        System.out.print("Result of Original Expression: ");
        System.out.println(!(a == b) || !(g != 5));

        System.out.print("Result of Modified Expression: ");
        //System.out.println((a != b) && (g == 5));
        System.out.println(!((a == b) || (g != 5)));

        System.out.print("Result of Modified Expression: ");
        System.out.println(!((x <= 8) && (y > 4)));

        System.out.print("Result of Original Expression: ");
        //System.out.println(((x > 8) || (y < 4)));
        System.out.println(!(((x > 8) && (y < 4))));

        System.out.print("Result of Original Expression: ");
        System.out.println(!(x < 5) && !(y >= 7));

        System.out.print("Result of Modified Expression: ");
        //System.out.println(!(x > 5) || !(y < 7));
        System.out.println(!((x < 5) || (y >= 7)));
    }
}
