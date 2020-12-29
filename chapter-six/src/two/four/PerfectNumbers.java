package two.four;

public class PerfectNumbers {

    public boolean isPerfect(int number) {
        int sumOfFactors = 0;
        for (int possibleFactor = 1; possibleFactor <= (number / 2); possibleFactor++) {
            if(number % possibleFactor == 0) {
                sumOfFactors += possibleFactor;
            }
        }

        return sumOfFactors == number;
    }

    private String getFactorsOfPerfectNumber(int number) {
        String factors = "";
        for (int possibleFactor = 1; possibleFactor <= (number / 2); possibleFactor++) {
            if(number % possibleFactor == 0) {
                factors = (factors.isEmpty()) ?
                        (possibleFactor + "") :
                        (factors + ", " + possibleFactor);
            }
        }
        return factors;
    }


    public void displayPerfectNumbers(int start, int end) {
        System.out.printf("Perfect Numbers between %d and %d%n", start, end);
        for (int possiblePerfectNumber = start; possiblePerfectNumber <= end; possiblePerfectNumber++) {
            if(isPerfect(possiblePerfectNumber)) {
                System.out.printf("%-5d: %s%n", possiblePerfectNumber, getFactorsOfPerfectNumber(possiblePerfectNumber));
            }
        }
    }
}
