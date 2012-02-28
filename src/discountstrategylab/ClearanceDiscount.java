package discountstrategylab;

/**
 * 
 * @author Barb Beiswenger
 */
public class ClearanceDiscount implements DiscountStrategy {

    private double  unitPrice,
                    percentOff = .20,
                    quantity;
    
    @Override
    //ClearanceDiscount is a buy one, get one half off
    public double getDiscountAmount() {
        
        if(quantity > 5) {
            percentOff = getUnitPrice() * getQuantity() * (getPercentOff() * 2);
        } else if (quantity > 2) {
            percentOff = getUnitPrice() * getQuantity() * (getPercentOff() * 1.5);
        } else {
            percentOff = getUnitPrice() * getQuantity() * (getPercentOff());
        }
        return percentOff;
    }
    
    @Override
    public double getUnitPrice() {
        return unitPrice;
    }

    @Override
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public double getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getPercentOff() {
        return percentOff;
    }

    @Override
    public void setPercentOff(double percentOff) {
        this.percentOff = percentOff;
    }
    
//    public static void main(String[] args) {
//        
//        DiscountStrategy discount = new ClearanceDiscount();
//        discount.setUnitPrice(10.00);
////        discount.setPercentOff(.10);
//        discount.setQuantity(6);
//        
//        double amt = discount.getDiscountAmount();
//        
//        System.out.println("The discount is $" + amt);        
//    }
}
