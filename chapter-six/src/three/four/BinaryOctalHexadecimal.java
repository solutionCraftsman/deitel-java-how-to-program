package three.four;

public class BinaryOctalHexadecimal {

    public int toBinary(int decimal) {
        String binary = "";
        int temp = decimal;

        while(temp > 0) {
            binary = (temp % 2) + binary;
            temp /= 2;
        }

        return Integer.parseInt(binary);
    }

    public int toOctal(int decimal) {
        String octal = "";
        int temp = decimal;

        while(temp > 0) {
            octal = (temp % 8) + octal;
            temp /= 8;
        }

        return Integer.parseInt(octal);
    }

    public String toHexadecimal(int decimal) {
        String hex = "";
        int temp = decimal;

        while(temp > 0) {
            hex = getHexValue((temp % 16)) + hex;
            temp /= 16;
        }

        return hex;
    }

    private String getHexValue(int decimal) {
        return switch (decimal) {
            case 10 -> "A";
            case 11 -> "B";
            case 12 -> "C";
            case 13 -> "D";
            case 14 -> "E";
            case 15 -> "F";
            default -> String.valueOf(decimal);
        };
    }
}
