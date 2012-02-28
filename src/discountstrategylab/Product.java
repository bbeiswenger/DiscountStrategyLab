package discountstrategylab;

/**
 *
 * @author Barb Beiswenger
 */
public class Product {
        
    private String  productId;
    private String  description;
    private double  unitPrice;
    private DiscountStrategy discount;

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }

    public Product(String productId, String description, double unitPrice, DiscountStrategy discount) {
        this.productId = productId;
        this.description = description;
        this.unitPrice = unitPrice;
        this.discount = discount;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    public double getDiscountAmount(double quantity) {
        discount.setUnitPrice(unitPrice);
        discount.setQuantity(quantity);
        return discount.getDiscountAmount();
    }

    @Override
    public String toString() {
        return "Product{" + "productId=" + productId + ", description=" + description + ", unitPrice="
                + unitPrice + ", discount=" + discount.getDiscountAmount() + '}';
    }
    
//    public static void main(String[] args) {
//        
//        Product product = new Product("12345", "hat", 10.00, new ClearanceDiscount());
//        
//        double amt = product.getDiscountAmount(6);
//        
//        System.out.println("The discount is $" + amt);        
//    }
}
