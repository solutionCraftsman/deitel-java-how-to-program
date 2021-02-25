package two.two;

public class Square {
    private boolean hasBeenVisitedByKnight;
    private final SquareAccessibilityNumber accessibilityNumber;

    public boolean hasBeenVisitedByKnight() {
        return hasBeenVisitedByKnight;
    }

    public Square(SquareAccessibilityNumber accessibilityNumber) {
        this.accessibilityNumber = accessibilityNumber;
    }

    public SquareAccessibilityNumber getAccessibilityNumber() {
        return accessibilityNumber;
    }

    public void setToHaveBeenVisitedByKnight() {
        this.hasBeenVisitedByKnight = true;
    }
}
