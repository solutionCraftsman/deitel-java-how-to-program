package pentazon.product;

import java.math.BigDecimal;

public class Product {
    private String productId;
    private String name;
    private String description;
    private BigDecimal price;

    public Product() {}

    public Product(String productName, String description, BigDecimal price) {
        this.name = productName;
        this.description = description;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
