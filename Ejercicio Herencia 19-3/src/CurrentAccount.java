import java.util.Scanner;
public class CurrentAccount extends Account{
 private static float overdraft; //Atributo de sobregiro

    public CurrentAccount(float balance, float anualRate, float overdraft) {
        super(balance, anualRate);
        this.overdraft = overdraft;
    }

    //Getter

    public float getOverdraft() {
        return overdraft;
    }
    //Setter

    public void setOverdraft(float overdraft) {
        this.overdraft = overdraft;
    }

    //Metodo para consignar una cantidad de dinero utilizando su saldo
    @Override
    public void record() {
        super.record();
        balance -= overdraft; //Se le resta el sobregiro
    }

    //Metodo para retirar el saldo
    @Override
    public void withdraw() {
        Scanner sc = new Scanner(System.in);

        while (true){
            try {
                System.out.print("Ingrese el monto a retirar: $");
                amount = sc.nextFloat();
                if (amount > balance){
                    overdraft = amount - balance; //El dinero que debe queda como sobregiro
                    balance = 0;
                    numberwithdrawal++; //Suma el numero de retiros cada vez que se efectua la operacion
                    break;
                }else if (amount < 0){
                    System.out.println("No se pueden ingresar numeros negativos");
                }else {
                    balance = balance - amount;
                    numberwithdrawal ++; //Suma el numero de retiros cada vez que se efectua la operacion
                    break;
                }

            }catch (Exception E){
                System.out.println("Se debe ingresar un monto valido");
                sc.nextLine(); //Limpio el buffer
            }
        }
    }

    //Metodo para calcular el interes mensual
    @Override
    public void calculateInterest() {
        super.calculateInterest();
    }

    //Metodo para calcular el Extracto Mensual (utiliza el metodo anterior)
    @Override
    public void calculateStatement() {
        super.calculateStatement();
    }

    //Metodo para imprimir los valores de los atributos
    @Override
    void printData() {
        int numberOfTransactions;
        super.printData();
        numberOfTransactions = numberConsignemets + numberwithdrawal;
        System.out.println("Numero de Transacciones realizadas: " + numberOfTransactions);
        System.out.println("Valor de sobregiro: " + overdraft);
    }
}
