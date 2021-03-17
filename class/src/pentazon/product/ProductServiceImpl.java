package pentazon.product;

import pentazon.exceptions.ProductException;

import java.util.Map;

public class ProductServiceImpl implements ProductService {

    private ProductDB productRepo = new ProductDB();

    /**
     * search for product with the specified id
     * @param productId
     * @return product with specified product id
     */
    @Override
    public Product findProductById(String productId) throws ProductException {
        return productRepo.getProductById(productId);
    }

    @Override
    public Map<String, Product> getAllProducts() {
        return productRepo.getMockProducts();
    }

    /**
     * add a new product to inventory
     *
     * @param product
     * @return
     * @throws ProductException
     */
    @Override
    public boolean addProduct(Product product) throws ProductException {
        this.isValidProduct(product);
        productRepo.getMockProducts().put(product.getProductId(), product);
        return true;
    }

    /**
     * product should no longer be offered to buyers
     *
     * @param product
     * @return
     * @throws ProductException
     */
    @Override
    public boolean removeProduct(Product product) throws ProductException {
        if(product == null) {
            throw new ProductException("Cannot remove a null product");
        }
        return false;
    }

    private boolean isValidProduct(Product product) throws ProductException {
        if(product == null) {
            throw new ProductException("Cannot add a null product");
        }
        if(product.getName() == null || product.getName().equals("")) {
            throw new ProductException("Product name is required");
        }
        if(product.getPrice() == null) {
            throw new ProductException("Every product needs a price");
        }

        return true;
    }
}
