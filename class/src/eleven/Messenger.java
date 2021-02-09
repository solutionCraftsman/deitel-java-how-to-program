package eleven;

public class Messenger {

    public Beans orderBeansWith(int amount, int quantity, boolean withOil, boolean isMoneyFake)
        throws Exception {
        return buyBeansWith(amount, quantity, withOil, isMoneyFake);
    }

    private Beans buyBeansWith(int amount, int demandedQuantity, boolean withOil, boolean isMoneyFake)
        throws MoneyIssueException {

        final int PRICE_PER_SPOON = 100;
        int quantityOfBeansAffordable = amount / PRICE_PER_SPOON;

        if(isMoneyFake) {
            throw new FakeMoneyException("Yahoo boy!");
        }

        if(demandedQuantity != quantityOfBeansAffordable) {
            throw new MoneyNoReachException("Money no reach for " + demandedQuantity);
        }

        return new Beans(amount, withOil);
    }

}
