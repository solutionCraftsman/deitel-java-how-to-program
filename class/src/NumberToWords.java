public class NumberToWords {

    private final String[][] numberWords = {
            {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"},
            {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"},
            {"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"},
            {"Hundred", "Thousand", "Million", "Billion", "Trillion"},
    };

    public String convert(int number) {

        String numberInWord = "";
        String numberToString = "" + number;
        int numberLength = numberToString.length();
        int currentDigit;
        boolean hasNotAppendedAnd = true;

        for (int digitIndex = 0, reducingLength = numberLength; digitIndex < numberLength;
             digitIndex++, reducingLength--) {

            currentDigit = Integer.parseInt(String.valueOf(numberToString.charAt(digitIndex)));

            if (currentDigit == 0) {
                continue;
            }

            switch (reducingLength) {
                case 1 -> {
                    if (digitIndex == 0) {
                        numberInWord += numberWords[0][currentDigit];
                    } else {
                        if (hasNotAppendedAnd) {
                            numberInWord += "and " + numberWords[0][currentDigit];
                            hasNotAppendedAnd = false;
                        } else {
                            numberInWord += numberWords[0][currentDigit];
                        }
                    }
                }

                case 2 -> {
                    if (digitIndex == 0) {
                        numberInWord += numberWords[2][currentDigit - 1];
                    } else {
                        if (hasNotAppendedAnd) {
                            numberInWord += "and " + numberWords[2][currentDigit - 1];
                            hasNotAppendedAnd = false;
                        }
                    }
                }

                case 3 -> {
                    numberInWord += numberWords[0][currentDigit];
                    numberInWord += " " + numberWords[3][0];
                }
            }

            if (digitIndex < numberLength - 1) {
                numberInWord += " ";
            }
        }

        System.out.println(numberInWord);
        return numberInWord;
    }
}
