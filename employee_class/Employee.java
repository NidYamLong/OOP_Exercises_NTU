package employee_class;

/**
 *  @Author Leonardo Marques - 06/06/2026
*/

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        setSalary(salary);
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getName() {
        return getFirstName() + " " + getLastName();
    }

    public int getSalary() {
        return this.salary;
    }

    public final void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return getSalary() * 12;
    }

    public int raiseSalary(int percent) {
        int additional_value = (getSalary() * percent) / 100;
        int new_salary = getSalary() + additional_value;

        setSalary(new_salary);

        return getSalary();
    }

    @Override
    public String toString() {
        return "Employee[id=" + getId() +
            ",name=" + getName() +
            ",salary=" + getSalary() + 
            "]";
    }
}
