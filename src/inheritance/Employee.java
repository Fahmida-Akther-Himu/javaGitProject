package inheritance;

public class Employee extends University {
    public String employeeName = "Professor Md. Shorif Uddin";
    private String salary = "50000";

    public Employee() {
        super();
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public void payInformathion() {
        System.out.println("Employee name is : " + employeeName);
        System.out.println("His salary was : " + salary);
        System.out.println("This employee has spent the last five years at this university.");
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.payInformathion();
        employee.print();
    }


}
