public class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department){
        super(name, salary);
        this.department = department;
    }

    // Método que sobreescribe el método de la clase Employee ya que es protected
    @Override
    public void showEmployeeInfo(){
        super.showEmployeeInfo();
        System.out.println("Department: " + department);
    }
}
