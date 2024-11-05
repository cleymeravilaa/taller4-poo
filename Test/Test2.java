package Test;

import Package.Motorcycle;
import Package.Vehicle;

public class Test2 {
    public static void main(String[] args) {
        
        Vehicle vehicle = new Vehicle("Honda", "CBR1000");


        Motorcycle motorcycle = new Motorcycle("Honda", "CBR1000", true);

        /**
         * Como nos encontramos en un paquete distinto, no podemos acceder a las variables de la clase
         * que está en el paquete principal. Ya que sus atributos son protected, no podemos acceder a ellos.
         */
        System.out.println("Marca del vehículo: " + vehicle.brand); // Error: The field brand is not visible
        System.out.println("Modelo del vehículo: " + vehicle.model); // Error: The field model is not visible

        System.out.println("Marca del motocicleta: " + motorcycle.brand); // Error: The field brand is not visible
        System.out.println("Modelo del motocicleta: " + motorcycle.model); // Error: The field model is not visible
        System.out.println("Es cilindrical: " + motorcycle.isCilindrical); // Podemos acceder ya que es publico
    }
}
