class Employee {

    private String name;
    private double salary;


    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    
    public void setSalary(double salary) {
        this.salary = salary;
    }


    public double getSalary() {
        return salary;
    }

    public void showDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeMain {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Aman", 30000);

        emp1.showDetails();

        emp1.setSalary(35000);

        System.out.println("Updated Salary: " + emp1.getSalary());

    }

}