package eleven;

public class Beans {
    private int quantityInSpoons;
    private boolean withOil;

    public Beans(int amount, boolean withOil) {
        final int PRICE_PER_SPOON = 100;
        this.quantityInSpoons = amount / PRICE_PER_SPOON;
        this.withOil = withOil;
    }

    public int getQuantityInSpoons() {
        return quantityInSpoons;
    }

    public void setQuantityInSpoons(int quantityInSpoons) {
        this.quantityInSpoons = quantityInSpoons;
    }

    public boolean isWithOil() {
        return withOil;
    }

    public void setWithOil(boolean withOil) {
        this.withOil = withOil;
    }

    @Override
    public String toString() {
        String toStringMessage = "Beans{" +
                "quantityOfSpoons=" + quantityInSpoons;

        if(withOil) {
            toStringMessage +=
                    ", served with oil" +
                    '}';
        }

        /*return "Beans{" +
                "quantityOfSpoons=" + quantityInSpoons +
                ", withOil=" + withOil +
                '}';*/

        return toStringMessage;
    }
}
