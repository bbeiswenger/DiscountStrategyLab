package discountstrategylab;

/**
 *
 * @author Barb Beiswenger
 */
public class HolidayDiscount implements DiscountStrategy {
    
    private double  unitPrice,
                    percentOff = .25,
                    quantity;

    @Override
    public double getDiscountAmount() {
        return getUnitPrice() * getQuantity() * getPercentOff();
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
//        DiscountStrategy discount = new HolidayDiscount();
//        discount.setUnitPrice(20.00);
//        discount.setPercentOff(.10);
//        discount.setQuantity(1);
//        
//        double amt = discount.getDiscountAmount();
//        
//        System.out.println("The discount is " + amt);        
//    }

}
