package discountstrategylab;

/**
 * This is a change
 * @author Barb Beiswenger
 */
public class Startup {

    public static void main(String[] args) {
        
        CashRegister cr = new CashRegister();
        
        cr.startNewSale("B51015");
        
        cr.scanItem("12345", 3);
        cr.scanItem("24680", 5);
        cr.scanItem("36912", 7);
        
        cr.printReciept();

    }
}
