package pentazon.shopping;

import pentazon.customers.Buyer;
import pentazon.exceptions.CheckoutException;

public class ShoppingServiceImpl implements ShoppingService {

    @Override
    public boolean checkOut(Buyer buyer) throws CheckoutException {
        this.isValidCheckout(buyer);
        return false;
    }

    private boolean isValidCheckout(Buyer buyer) throws CheckoutException {
        if(buyer == null) {
            throw new CheckoutException("No buyer found at check out");
        }

        if(buyer.getCart() == null) {
            //@todo log error
            throw new CheckoutException("No cart found at check out");
        }

        if(buyer.getCart().getItems().isEmpty()) {
            //@todo log error
            throw new CheckoutException("Cart is empty at check out");
        }

        if(buyer.getCards() == null || buyer.getCards().isEmpty()) {
            //@todo log error
            throw new CheckoutException("No payment cards found at check out");
        }

        return true;
    }
}
