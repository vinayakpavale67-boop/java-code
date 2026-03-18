package experiment3;

// Parent class
class Employee {
    String name;
    int id;
    double salary;

    // Constructor
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display details
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }

    // Method Overloading
    void calculateSalary() {
        System.out.println("Salary: " + salary);
    }

    void calculateSalary(double bonus) {
        System.out.println("Salary with Bonus: " + (salary + bonus));
    }
}

// Child class (Inheritance)
class Manager extends Employee {
    String department;

    // Constructor
    Manager(String name, int id, double salary, String department) {
        super(name, id, salary);   // calling parent constructor
        this.department = department;
    }

    // Method Overriding
    @Override
    void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}

// Main class
public class employeedetails {
    public static void main(String[] args) {

        Employee emp = new Employee("Vinayak", 15, 45000);
        Manager mgr = new Manager("Shivraj", 11, 65000, "IT");

        System.out.println("Employee Details:");
        emp.display();
        emp.calculateSalary();
        emp.calculateSalary(2000);

        System.out.println("\nManager Details:");
        mgr.display();
        mgr.calculateSalary(5000);
    }
}