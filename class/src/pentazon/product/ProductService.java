package pentazon.product;

import pentazon.exceptions.ProductException;

import java.util.Map;

/**
 * Provides services for dealing with products in Pentazon
 */
public interface ProductService {

    /**
     * search for product with the specified id
     * @param productId
     * @return product with specified product id
     */
    public Product findProductById(String productId) throws ProductException;

    public Map<String, Product> getAllProducts();

    /**
     * add a new product to inventory
     * @param product
     * @return
     * @throws ProductException
     */
    public boolean addProduct(Product product) throws ProductException;

    /**
     * product should no longer be offered to buyers
     * @param product
     * @return
     * @throws ProductException
     */
    public boolean removeProduct(Product product) throws ProductException;
}
