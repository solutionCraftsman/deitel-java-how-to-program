package one.four;

public class Exponentiation {

    public long integerPower(int base, int power) {
        long product = 1;
        for (int i = 1; i <= power; i++) {
            product *= base;
        }
        return product;
    }
}
