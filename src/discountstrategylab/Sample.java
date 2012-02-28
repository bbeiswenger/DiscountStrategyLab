package discountstrategylab;
import java.util.ArrayList;

/**
 *
 * @author barb
 */
      
public class Sample {
  public static void main(String[] a) {
    ArrayList<Employee> emps = new ArrayList<Employee>();
    emps.add(new Employee("A", "G"));
    emps.add(new Employee("T", "A"));
    emps.add(new Employee("K", "J"));

    System.out.println(emps);

    Employee e = emps.get(1);
    e.setLastName("new");

    System.out.println(emps);
  }
}

class Address {
}

class Employee {
  private String lastName;

  private String firstName;

  private Double salary;

  public Address address;

  public Employee(String lastName, String firstName) {
    this.lastName = lastName;
    this.firstName = firstName;
    this.address = new Address();

  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public double getSalary() {
    return this.salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
}
