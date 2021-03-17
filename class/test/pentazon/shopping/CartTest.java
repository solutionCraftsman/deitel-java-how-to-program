package pentazon.shopping;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pentazon.product.Product;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    Cart cart;

    @BeforeEach
    void setUp() {
        cart = new Cart();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addToCart() {
        assertTrue(cart.getItems().isEmpty());
        Product plantainChips = new Product("Adunni Chips",
                "Savoury plantain chips", new BigDecimal(50));
        plantainChips.setProductId("AD001");
        cart.addToCart(plantainChips);
        assertFalse(cart.getItems().isEmpty());
        assertEquals(1, cart.getItems().size());
    }

    @Test
    void removeFromCart() {
        assertTrue(cart.getItems().isEmpty());
        Product plantainChips = new Product("Adunni Chips",
                "Savoury plantain chips", new BigDecimal(50));
        plantainChips.setProductId("AD001");
        cart.addToCart(plantainChips);
        assertFalse(cart.getItems().isEmpty());
        assertEquals(1, cart.getItems().size());

        boolean result = cart.removeFromCart(plantainChips);
        assertTrue(result);
        assertTrue(cart.getItems().isEmpty());
    }

    @Test
    void calculateTotal_with_singleCartItems() {
        assertTrue(cart.getItems().isEmpty());
        Product plantainChips = new Product("Adunni Chips",
                "Savoury plantain chips", new BigDecimal(50));
        plantainChips.setProductId("AD001");
        cart.addToCart(plantainChips);

        Product shirt = new Product("Vintage Shirt",
                "Vintage Versace shirt", new BigDecimal(5000));
        shirt.setProductId("AD003");
        cart.addToCart(shirt);

        assertFalse(cart.getItems().isEmpty());
        assertEquals(2, cart.getItems().size());

        BigDecimal cartTotal = cart.calculateCartTotal();
        assertEquals(5050, cartTotal.intValue());
    }


    @Test
    void calculateTotal_with_multipleCartItems() {
        assertTrue(cart.getItems().isEmpty());
        Product plantainChips = new Product("Adunni Chips",
                "Savoury plantain chips", new BigDecimal(50));
        plantainChips.setProductId("AD001");
        cart.addToCart(plantainChips);

        Product shirt = new Product("Vintage Shirt",
                "Vintage Versace shirt", new BigDecimal(5000));
        shirt.setProductId("AD003");
        cart.addToCart(shirt);

        CartItem item = cart.getItems().get(plantainChips.getProductId());
        assertEquals(1, item.getQuantity());

        item = cart.getItems().get(plantainChips.getProductId());
        assertEquals(1, item.getQuantity());

        cart.addToCart(plantainChips, 9);
        assertEquals(2, cart.getItems().size());

        item = cart.getItems().get(plantainChips.getProductId());
        assertEquals(10, item.getQuantity());

        BigDecimal cartTotal = cart.calculateCartTotal();
        assertEquals(5500, cartTotal.intValue());

        cart.addToCart(shirt, 3);
        assertEquals(2, cart.getItems().size());

        item = cart.getItems().get(shirt.getProductId());
        assertEquals(4, item.getQuantity());

        cartTotal = cart.calculateCartTotal();
        assertEquals(20500, cartTotal.intValue());
    }
}