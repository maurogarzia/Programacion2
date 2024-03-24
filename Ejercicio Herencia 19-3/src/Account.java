import java.util.Scanner;

public abstract class Account {
    protected static float balance; //Saldo
    protected static int numberConsignemets ; //Numero de consignaciones
    protected static int numberwithdrawal ; //Numero de retiros
    protected float anualRate; //Tasa anual
    protected float monthlyCommission; //Comision mensual

    //Constructor

    public Account(float balance, float anualRate) {
        this.balance = balance;
        this.numberConsignemets = 0;
        this.numberwithdrawal = 0;
        this.anualRate = anualRate;
        this.monthlyCommission = 0;
    }

    //Getter

    public float getBalance() {
        return balance;
    }

    public int getNumberConsignemets() {
        return numberConsignemets;
    }

    public int getNumberwithdrawal() {
        return numberwithdrawal;
    }

    public float getAnualRate() {
        return anualRate;
    }

    public float getMonthlyCommission() {
        return monthlyCommission;
    }

    //Setter

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setNumberConsignemets(int numberConsignemets) {
        this.numberConsignemets = numberConsignemets;
    }

    public void setNumberwithdrawal(int numberwithdrawal) {
        this.numberwithdrawal = numberwithdrawal;
    }

    public void setAnualRate(float anualRate) {
        this.anualRate = anualRate;
    }

    public void setMonthlyCommission(float monthlyCommission) {
        this.monthlyCommission = monthlyCommission;
    }

    float amount; //Inicializo la variable de monto

    //Metodo para consignar una cantidad de dinero utilizando su saldo
    public void record(){
        Scanner sc = new Scanner(System.in);

        while (true){
            try {
                System.out.print("Ingrese el monto: $");
                amount = sc.nextFloat();
                if(amount < 0){
                    System.out.println("No se puede ingresar numeros negativos");
                }else {
                    balance = balance + amount;
                    numberConsignemets ++; //Suma el numero de consignaciones cada vez que se efectua una operacion
                    break;
                }
            }catch (Exception E){
                System.out.println("Se debe ingresar un monto valido");
                sc.nextLine(); //Limpio el buffer
            }
        }
    }

    //Metodo para retirar el saldo
    public void withdraw(){
        Scanner sc = new Scanner(System.in);

        while (true){
            try {
                System.out.print("Ingrese el monto a retirar: $");
                amount = sc.nextFloat();
                if (amount > balance){
                    System.out.println("Saldo insuficiente!");
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
    public void calculateInterest(){
        float interest = balance * (anualRate/12) / 100 ;
        balance = balance + interest;
    }


    //Metodo para calcular el Extracto Mensual (utiliza el metodo anterior)
    public void calculateStatement(){
        balance -= monthlyCommission;
        calculateInterest();
    }

    //Metodo para imprimir los valores de los atributos
    void printData() {
        System.out.println("Saldo: " + balance);
        System.out.println("Numero de consignaciones: " + numberConsignemets);
        System.out.println("Numero de retiros: " + numberwithdrawal);
        System.out.println("Tasa anual: " + anualRate);
        System.out.println("Comison mensual: " + monthlyCommission);
    }

}





