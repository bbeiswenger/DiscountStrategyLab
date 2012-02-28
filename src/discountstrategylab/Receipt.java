package discountstrategylab;

import java.util.ArrayList;


/**
 *
 * @author Barb Beiswenger
 */
public class Receipt {
    
    private double      totalDiscount,
                        grandTotal,
                        subtotal;
    private Customer    customer;
    private LineItem    lineItem;
    
    private Customer[] customers = {
        new Customer("51015", "Steve", "Black"),
        new Customer("61218", "Susan", "Lane"),
        new Customer("71421", "Mary", "Smith")
    };

    private LineItem[] lineItems = new LineItem[0];
    
    public double getGrandTotal() {
        
        for(LineItem li : lineItems) {
            grandTotal += lineItem.getSubtotal();
        }
        return grandTotal;
    }

    public double getTotalDiscountAmount() {
        for(LineItem li : lineItems){
            totalDiscount += lineItem.getDiscountAmount();
        }
        return totalDiscount;
    }
    
    public Customer getCustomer() {
        return customer;
    }
    
    public void addNewLineItem(String productId, double quantity) {
        LineItem lineItem = new LineItem(productId, quantity);
        lineItem.setProduct(lineItem.productIdLookup(productId));
        addLineItem(lineItem);
    }
    
    public void startNewSale(String customerNo) {
        this.customer = customerNoLookup(customerNo);
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
        
    private void addLineItem(LineItem lineItem) {
        LineItem[] temp = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, temp, 0, lineItems.length);
        temp[temp.length-1] = lineItem;
        lineItems = temp;
    }

    // Remove line item from array
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
    
    public void printReceipt(){
        customer.toString();
        for (LineItem item : lineItems) {
            System.out.println(lineItem.getLineItem());
        }
    }
    
    public static void main(String[] args) {
        
        Customer customer = new Customer("B51015", "Steve", "Black");
        System.out.println(customer);
        
    }    
    
}
