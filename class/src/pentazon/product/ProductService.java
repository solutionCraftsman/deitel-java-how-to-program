package pentazon.product;

import pentazon.exceptions.ProductException;

/**
 * Provides services for dealing with products in Pentazon
 */
public interface ProductService {

    /**
     * search for product with the specified id
     * @param productId
     * @return product with specified product id
     */
    Product findProductById(String productId) throws ProductException;

}
