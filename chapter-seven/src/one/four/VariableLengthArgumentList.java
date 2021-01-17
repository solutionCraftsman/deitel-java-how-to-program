package one.four;

public class VariableLengthArgumentList {

    public int calculateProduct(int... integers) {
        int total = 1;
        for(int integer: integers) {
            total *= integer;
        }
        return total;
    }
}
