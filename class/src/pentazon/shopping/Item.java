package pentazon.shopping;

import pentazon.product.Product;

import java.math.BigDecimal;

public class Item {
    private Product product;
    private int quantity;
    private BigDecimal total = BigDecimal.ZERO;

    public Item(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public void addItems(int quantity) {
        this.quantity += quantity;
        total = product.getPrice().multiply(BigDecimal.valueOf(this.quantity));
    }

    public void reduceItems(int quantity) {
        if(this.quantity > quantity) {
            this.quantity -= quantity;
            total = product.getPrice().multiply(BigDecimal.valueOf(this.quantity));
        }
    }
}
