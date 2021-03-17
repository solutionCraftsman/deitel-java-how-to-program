package pentazon.shopping;

import pentazon.customers.Buyer;
import pentazon.exceptions.CheckoutException;

public interface ShoppingService {

    public boolean checkOut(Buyer customer) throws CheckoutException;

}
