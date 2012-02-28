package discountstrategylab;

import java.util.ArrayList;


/**
 *
 * @author Barb Beiswenger
 */
public class Receipt {
    
    private double      total,
                        subtotal;
    private Customer    customer;
    private LineItem    lineItem;
    
    private Customer[] customers = {
        new Customer("B51015", "Steve", "Black"),
        new Customer("L61218", "Susan", "Lane"),
        new Customer("S71421", "Mary", "Smith")
    };

    private LineItem[] lineItems = new LineItem[0];
    
    public double getTotal() {
        
        for(LineItem li : lineItems) {
            total += lineItem.getSubtotal();
        }
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }    
    
    public void addNewLineItem(String productId, double quantity) {
        LineItem lineItem = new LineItem(productId, quantity);
        lineItem.setProduct(lineItem.productIdLookup(productId));
        addLineItem(lineItem);
    }
    
    public void startNewSale(String customerNo) {
        customerNoLookup(customerNo);
    }    
    
    public Customer customerNoLookup(String customerNo) {
        Customer customer = null;
        
        for (Customer c : customers) {
            if (c.getCustomerNo().equals(customerNo)) {
                customer = c;
                break;
            }
        }
        return customer;
    }
        
public void addLineItem(LineItem lineItem) {
        LineItem[] temp = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, temp, 0, lineItems.length);
        temp[temp.length-1] = lineItem;
        lineItems = temp;
    }

    // Normally you would not make this static!!
    // Here's a method that encapsulates the logic for removing an item
    public void removeLineItem(LineItem lineItem) {
        LineItem[] temp = new LineItem[lineItems.length - 1];

        for(int i=0, j=0; j < lineItems.length; i++, j++) {
            if(lineItems[j].equals(lineItem)) {
                // skip it, but decrement the counter first
                --i;
            } else {
                // copy it
                temp[i] = lineItems[j];
            }
        }

        lineItems = temp;
    }
    
    public void printReciept(){
        for (LineItem item : lineItems) {
            System.out.println(lineItem.getLineItem());
        }
    }
    
    public static void main(String[] args) {
        
        Customer customer = new Customer("B51015", "Steve", "Black");
        System.out.println(customer);
    }    
    
}
