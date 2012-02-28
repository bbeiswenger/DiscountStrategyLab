package discountstrategylab;

/**
 *
 * @author Barb Beiswenger
 */
public class Customer {
    
    private String firstName;
    private String lastName;
    private String customerNo;
    
    public Customer(String customerNo, String firstName, String lastName) {
        this.customerNo = customerNo;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public String getCustomer() {
        return getCustomerNo() + getFirstName() + " " + getLastName();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + "\n" + customerNo
                + "\n--------------------------";
    }
    
}
