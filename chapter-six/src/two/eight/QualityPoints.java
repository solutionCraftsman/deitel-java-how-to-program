package two.eight;

public class QualityPoints {

    public int qualityPoints(int studentAverage) {

        return switch (studentAverage / 10) {
            case 10, 9 -> 4;
            case 8 -> 3;
            case 7 -> 2;
            case 6 -> 1;
            default -> 0;
        };

    }
}
