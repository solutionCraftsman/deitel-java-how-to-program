package pentazon.shopping;

import pentazon.customers.Buyer;
import pentazon.exceptions.CheckoutException;

public interface ShoppingService {

    public Order checkOut(Buyer customer) throws CheckoutException;

}
