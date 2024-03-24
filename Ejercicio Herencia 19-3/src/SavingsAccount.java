
public class SavingsAccount extends Account{
    private boolean active ; //Atributo para saber si la cuenta esta activa

    //Constructor
    public SavingsAccount(float balance, float anualRate) {
        super(balance, anualRate);
        if (balance < 10000){
            active = false;
        }else {
            active = true;
        }
    }

    //Getter
    public boolean isActive() {
        return active;
    }

    //Setter
    public void setActive(boolean active) {
        this.active = active;
    }


    //Metodo para consignar una cantidad de dinero utilizando su saldo

    @Override
    public void record() {
        if(!active){
            System.out.println("La cuenta no esta activada, por lo que no es posible realizar la operacion");
        }else {
                super.record();
            }
        }


    //Metodo para retirar el saldo
    @Override
    public void withdraw() {
        if(!active){
            System.out.println("La cuenta no esta activada, por lo que no es posible realizar la operacion");
        }else if (amount > balance) {
            System.out.println("Saldo insuficiente!");
        }else {
           super.withdraw();
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
        if (numberwithdrawal > 4){ //Si hay mas de 4 retiros se le resta 1000 al saldo por cada retiro
            monthlyCommission = 1000;
        }
            super.calculateStatement();
        }

    //Metodo para imprimir los valores de los atributos
    @Override
    void printData() {
        int numberOfTransactions;
        super.printData();
        numberOfTransactions = numberConsignemets + numberwithdrawal;
        System.out.println("Numero de Transacciones realizadas: " + numberOfTransactions);
    }
}



