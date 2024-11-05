public class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    // Definimos un metodo protected para que pueda ser sobreescrito por subclasses
    protected void showEmployeeInfo(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}