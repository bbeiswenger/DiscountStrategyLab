package discountstrategylab;

/**
 *
 * @author Barb Beiswenger
 */
public class CashRegister {
    
    private Receipt receipt;
    
     public void startNewSale(String customerNo) {
        receipt.startNewSale(customerNo);
    }
    public void scanItem(String productId, double quantity) {
        receipt.addNewLineItem(productId, quantity);
    }
    
    public void printReciept() {
        receipt.printReciept();
    }
    
    private Product[] products = {};
    
 
    
}
