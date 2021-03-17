package pentazon.shopping;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pentazon.customers.Address;
import pentazon.customers.Buyer;
import pentazon.customers.Customer;
import pentazon.exceptions.CheckoutException;
import pentazon.payments.PaymentCard;
import pentazon.product.Product;
import pentazon.product.ProductDB;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingServiceImplTest {

    private ShoppingService shoppingService;
    private Buyer dozie;

    @BeforeEach
    void setUp() {
        shoppingService = new ShoppingServiceImpl();
        ProductDB products = new ProductDB();
        dozie = new Buyer();
        PaymentCard fbnVisa = new PaymentCard("123456", "Don Dozie", LocalDate.of(2025, 7, 31));
        dozie.getCards().add(fbnVisa);
        Cart dozieCart = new Cart();

        //add plantain chips to cart
        dozieCart.addToCart(products.getMockProducts().get("AD001"), 5);

        dozieCart.setPaymentCard(dozie.getCards().get(0));
        Address home = new Address();
        home.setHouseNumber(1);
        home.setStreet("Aso Rock Avenue");
        home.setCity("Aso Rock");
        dozie.getAddresses().add(home);

        dozieCart.setDeliveryAddress(dozie.getAddresses().get(0));
        dozie.setCart(dozieCart);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void checkoutWith_nullBuyer() {
        assertThrows(CheckoutException.class,
                () -> shoppingService.checkOut(null));
    }

    @Test
    void checkoutWith_nullCart() {
        dozie.setCart(null);
        assertThrows(CheckoutException.class,
                () -> shoppingService.checkOut(null));
    }

    @Test
    void checkoutWith_emptyCart() {
        dozie.setCart(new Cart());
        assertThrows(CheckoutException.class,
                () -> shoppingService.checkOut(null));
    }

    @Test
    void checkoutWith_nullPaymentCard() {
        dozie.setCards(null);
        assertThrows(CheckoutException.class,
                () -> shoppingService.checkOut(null));
    }

    @Test
    void checkoutWith_emptyPaymentCard() {
        dozie.setCards(Collections.EMPTY_LIST);
        assertThrows(CheckoutException.class,
                () -> shoppingService.checkOut(null));
    }

    @Test
    void checkout() {
        try {
            Map<String, Item> cartItems = dozie.getCart().getItems();
            Address deliveryAddress = dozie.getCart().getDeliveryAddress();
            Order dozieOrder = shoppingService.checkOut(dozie);
            assertNotNull(dozieOrder);
            assertEquals(cartItems, dozieOrder.getOrderItems());
            assertTrue(dozieOrder.isPaid());
            assertEquals(deliveryAddress, dozieOrder.getDeliveryAddress());
            assertNull(dozie.getCart());
        } catch (CheckoutException e) {
            e.printStackTrace();
        }
    }

    @Test
    void checkout_withExpiredCard() {
        try {
            dozie.getCart().getPaymentCard().setExpiry(LocalDate.now());
            Map<String, Item> cartItems = dozie.getCart().getItems();
            Order dozieOrder = shoppingService.checkOut(dozie);
            assertNotEquals(cartItems, dozieOrder.getOrderItems());
            assertFalse(dozieOrder.isPaid());
            assertNotNull(dozie.getCart());
        } catch (CheckoutException e) {
            e.printStackTrace();
        }
    }


}