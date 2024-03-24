
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount cuentaAhorro = new SavingsAccount(240000,120 );
        int option;

        //Menu
        while (true) {
            try {
                System.out.println("\nOperaciones: ");
                System.out.println("1)_Ingresar Dinero");
                System.out.println("2)_Retirar Dinero");
                System.out.println("3)_Salir");
                System.out.println(" ");
                System.out.print("Ingrese el numero de la operacion que desea realizar ---> ");
                option = sc.nextInt();

                if (option == 1) {
                    cuentaAhorro.record(); //Ingreso dinero
                }else if (option == 2) {
                    cuentaAhorro.withdraw(); //Retiro dinero
                } else if (option == 3) {
                    break;
                }else System.out.println("Valor ingresado no valido");
            }catch (Exception E){
                System.out.println("Valor ingresado no valido");
                sc.nextLine(); //Limpio el buffer
            }

        }

        cuentaAhorro.calculateStatement(); //Llamo al metodo que hace el estracto bancario
        cuentaAhorro.printData(); //Llamo al metodo que muestra los valores de los atributos




    }
}