
public class FivePointOneThree {

    public static void main(String[] args) {
        System.out.println(factorial(20));;
    }

    static String factorial (int number) {
        if(number < 0) {
            return "0";
        }

        if(number == 0) {
            return "1";
        }

        long productSoFar = 1;
        String output = "";

        output = String.format("%-5s%-10s%n", "n", "n!");
        for (int currentValue = 1; currentValue <= number; currentValue++) {
            //System.out.printf("%5d", currentValue);
            output += String.format("%-5d", currentValue);
            productSoFar *= currentValue;
            //System.out.printf("%10d%n", productSoFar);
            output += String.format("%,-10d%n", productSoFar);
        }

        return output;
    }

}
