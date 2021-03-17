package pentazon.shopping;

import pentazon.customers.Buyer;
import pentazon.exceptions.CheckoutException;
import pentazon.payments.PaymentService;
import pentazon.payments.Paystack;

import java.time.LocalDate;

public class ShoppingServiceImpl implements ShoppingService {
    private PaymentService paymentService;

    public ShoppingServiceImpl() {
        this.paymentService = new Paystack();
    }

    @Override
    public Order checkOut(Buyer buyer) throws CheckoutException {
        this.isValidCheckout(buyer);
        Order order = new Order();
        Cart buyerCart = buyer.getCart();
        boolean result = paymentService.pay(buyerCart.getPaymentCard(), buyerCart.getTotal());

        if(result) {
            order.setOrderItems(buyer.getCart().getItems());
            order.setPaid(result);
            order.setOrderDate(LocalDate.now());
            order.setOrderTotal(buyerCart.getTotal());
            order.setDeliveryAddress(buyerCart.getDeliveryAddress());
            buyer.setCart(null);
        }

        return order;
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

        if(buyer.getCart().getPaymentCard() == null) {
            //@todo log error
            throw new CheckoutException("No payment cards found at check out");
        }

        return true;
    }
}
