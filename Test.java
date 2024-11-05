
public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("Cleymer", 4000);
        employee.showEmployeeInfo();

        Manager manager = new Manager("Andrea", 10000, "IT"); 
        manager.showEmployeeInfo();
    }
}