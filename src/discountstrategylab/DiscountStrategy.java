package discountstrategylab;

/**
 *
 * @author Barb Beiswenger
 */
public interface DiscountStrategy {
    
    public void setUnitPrice(double unitPrice);
    
    public double getUnitPrice();
    
    public void setQuantity(double quantity);
    
    public double getQuantity();
    
    public void setPercentOff(double percentOff);
    
    public double getPercentOff();
    
    public double getDiscountAmount();
    
}
