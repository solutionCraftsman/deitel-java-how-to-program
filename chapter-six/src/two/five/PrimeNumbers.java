package two.five;

public class PrimeNumbers {

    public boolean isPrime(int integer) {
        if(integer == 1) {
            return false;
        }

        for (int possibleDivisor = 2; possibleDivisor <= Math.sqrt(integer); possibleDivisor++) {
            if(integer % possibleDivisor == 0) {
                return false;
            }
        }
        return true;
    }

    public void displayPrimeNumbers(int limit) {
        for (int number = 1; number <= limit; number++) {
            if(isPrime(number)){
                System.out.print(number + ", ");
            }
            if(number % 100 == 0) {
                System.out.println();
            }
        }
    }
}
