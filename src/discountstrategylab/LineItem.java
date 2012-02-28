package discountstrategylab;

/**
 *
 * @author Barb Beiswenger
 */
public class LineItem {
    
    private String  productId;
    private double  quantity,
                    subtotal;
    private Product product;
    
    private Product[] products = {
        new Product("12345", "Lamp", 65.00, new NoDiscount()),
        new Product("24680", "Handbag", 75.00, new ClearanceDiscount()),
        new Product("36912", "Sweater", 35.99, new PresidentsDayDiscount())
    };

    public LineItem(String productId, double quantity) {
        this.productId = productId;
        this.quantity = getQuantity();
        product = productIdLookup(productId);
    }

    public void setLineItem() {
        
        product.getProductId();
        product.getDescription();
        product.getUnitPrice();
        product.getDiscount(quantity);
        getSubtotal();
        
    }

    public String getLineItem() {
        
        return product.getProductId() + "     " + getQuantity()
                 + "     " + product.getDescription()
                 + "     " + product.getUnitPrice() + "     " + getSubtotal();
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getSubtotal() {
        
        return getUnitPrice() * getQuantity() - product.getDiscount(quantity);
    }
    
    public String getProductId() {
        return product.getProductId();
    }

    private String getDescription() {
        return product.getDescription();
    }
    
    private double getUnitPrice() {
        return product.getUnitPrice();
    }
    
    private double getQuantity() {
        return quantity;
    }
    
    public Product productIdLookup(String productId) {
        Product product = null;
        
        for (Product p : products) {
            if (p.getProductId().equals(productId)) {
                product = p;
                break;
            }
        }
        return product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    public static void main(String[] args) {
        
        LineItem li = new LineItem("12345", 5);
        System.out.println(li.productIdLookup("12345"));
    }
}
