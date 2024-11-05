package Package;
public class Motorcycle extends Vehicle {
    public  boolean isCilindrical;

    public Motorcycle(String brand, String model, boolean isCilindrical){
        super(brand, model);
        this.isCilindrical = isCilindrical;
    }
}
