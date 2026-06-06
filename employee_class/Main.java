package employee_class;

/**
    The expected out is:

    Employee[id=8,name=Peter Tan,salary=2500]
    Employee[id=8,name=Peter Tan,salary=999]
    id is: 8
    firstname is: Peter
    lastname is: Tan
    salary is: 999
    name is: Peter Tan
    annual salary is: 11988
    1098
    Employee[id=8,name=Peter Tan,salary=1098]
 */

public class Main {
       public static void main(String[] args) {
      // Test constructor and toString()
      Employee e1 = new Employee(8, "Peter", "Tan", 2500);
      System.out.println(e1);  // toString();

      // Test Setters and Getters
      e1.setSalary(999);
      System.out.println(e1);  // toString();
      System.out.println("id is: " + e1.getId());
      System.out.println("firstname is: " + e1.getFirstName());
      System.out.println("lastname is: " + e1.getLastName());
      System.out.println("salary is: " + e1.getSalary());

      System.out.println("name is: " + e1.getName());
      System.out.println("annual salary is: " + e1.getAnnualSalary()); // Test method

      // Test raiseSalary()
      System.out.println(e1.raiseSalary(10));
      System.out.println(e1);
   }
}
