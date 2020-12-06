
public class FivePointTwoOne {
    public static void main(String[] args) {
        System.out.printf("%6s%10s%12s%n", "Side 1", "Side 2", "Hypotenuse");
        int limit = 500;
        for (int firstPossibleSide = 1; firstPossibleSide <= limit; firstPossibleSide++) {
            for (int secondPossibleSide = 1; secondPossibleSide <= limit; secondPossibleSide++) {
                for (int thirdPossibleSide = 0; thirdPossibleSide <= limit; thirdPossibleSide++) {
                    if((firstPossibleSide * firstPossibleSide) + (secondPossibleSide * secondPossibleSide) ==
                            (thirdPossibleSide * thirdPossibleSide)) {
                        System.out.printf("%6d%10d%12d%n", firstPossibleSide, secondPossibleSide, thirdPossibleSide);
                    }
                }
            }
        }
    }
}
