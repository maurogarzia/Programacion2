import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Coche auto = new Coche(250, 600);
        Camioneta chata = new Camioneta(300);
        Bicicleta bici = new Bicicleta("carrera");

        List<Vehiculo> lista = new ArrayList<Vehiculo>();

        lista.add(new Motocicleta("Rojo", 2, "Chopera", 155, 500)); //Objeto tipo Motocicleta
        lista.add(new Coche("Negro", 4, 300, 600)); //Objeto tipo coche
        lista.add(new Camioneta("Gris", 4, 250, 700, 100)); //Objeto tipo Camioneta
        lista.add(new Bicicleta("Azul", 2, "Carrera")); //Objeto tipo Bicicleta

        for (Vehiculo i : lista) {
            i.catalogar();
        }

        Vehiculo v = new Vehiculo(2);
        System.out.println(" ");
        System.out.println("Ingrese la cantidad de Ruedas: ");
        int ruedas = sc.nextInt();

        v.catalogar(ruedas);
    }
}