package discountstrategylab;

/**
 *
 * @author Barb Beiswenger
 */
public class NoDiscount implements DiscountStrategy {

    private double  unitPrice,
                    percentOff = 0,
                    quantity;
    
    @Override
    public double getDiscountAmount() {
        return unitPrice * quantity * percentOff;
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
//        DiscountStrategy discount = new NoDiscount();
//        discount.setUnitPrice(20.00);
//        discount.setPercentOff(.10);
//        discount.setQuantity(9);
//
//        double amt = discount.getDiscountAmount();
//
//        System.out.println("The discount is $" + amt);
//    }
    
}
