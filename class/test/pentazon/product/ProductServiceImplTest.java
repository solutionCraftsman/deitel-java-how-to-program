package pentazon.product;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pentazon.exceptions.ProductException;

import java.math.BigDecimal;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ProductServiceImplTest {

    ProductService productService;
    Product product;

    @BeforeEach
    void setUp() {
        productService = new ProductServiceImpl();
        product = new Product("TestProduct", "Product for testing purpose", BigDecimal.valueOf(10));
        product.setProductId("Test101");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findProduct() {
        Product product = null;
        try {
            product = productService.findProductById("AD001");
        } catch (ProductException e) {
            e.printStackTrace();
        }
        assertNotNull(product);
    }

    @Test
    void findProductWithInvalidId() {
        assertThrows(ProductException.class,
                ()->productService.findProductById("AD000"));
    }

    @Test
    void addNullProduct() {
        assertThrows(ProductException.class,
                ()->productService.addProduct(null));
    }

    @Test
    void addProductWithNullName() {
        product.setName(null);
        assertThrows(ProductException.class,
                ()->productService.addProduct(product));
    }

    @Test
    void addProductWithEmptyName() {
        product.setName("");
        assertThrows(ProductException.class,
                ()->productService.addProduct(product));
    }

    @Test
    void addProductWithNullPrice() {
        product.setPrice(null);
        assertThrows(ProductException.class,
                ()->productService.addProduct(product));
    }

    @Test
    void addProduct() {
        Map<String, Product> initialProducts = productService.getAllProducts();
        assertTrue(initialProducts.size() == 3);

        try {
            boolean result = productService.addProduct(product);
            Map<String, Product> allProducts = productService.getAllProducts();
            assertTrue(result);
            assertTrue(allProducts.size() == 4);
            Product check = productService.findProductById("Test101");
            assertNotNull(check);
        } catch (ProductException e) {
            e.printStackTrace();
        }
    }

    @Test
    void removeNullProduct() {
        assertThrows(ProductException.class,
                ()->productService.removeProduct(null));
    }

}