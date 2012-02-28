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
    
    public void printReceipt() {
        receipt.printReceipt();
    }
    
    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        
        receipt.startNewSale("51015");
        System.out.println();
        
    }
 
    
}
