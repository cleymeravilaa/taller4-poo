public class BankAccount {
    
    // No es correcto declarar atributos y datos criticos y delicados como protected
    // protected double balance;
    // protected String accountNumber;
    // protected String owner;
    // protected String password;

    // Sería más apropiado declarar atributos y datos como private
    private double balance; 
    private String accountNumber;
    private String owner;
    private String password;

    public BankAccount(double balance){
        // Verificar que el saldo no sea negativo
        if (balance<0) {
            this.balance = 0;
        }else {
            this.balance = balance;
        }
    }

    public void deposit(double amount){
        // Encapsular la variable saldo de manera adecuada para que no pueda ser facilmente manipulada
        if (amount<0) {
            System.out.println("No se puede depositar un saldo negativo");
        } else {
            balance += amount;
        }
    }

    public void withdraw(double amount){
        if (amount>balance) {
            System.out.println("No se puede retirar una cantidad mayor que el saldo actual");
        } else {
            balance -= amount;
        }
    }

    // La mejor manera de encapsular datos sensibles es creando getters y setters
    // Siempre y sea necesario
    public double getBalance(){
        return balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getOwner(){
        return owner;
    }

}
