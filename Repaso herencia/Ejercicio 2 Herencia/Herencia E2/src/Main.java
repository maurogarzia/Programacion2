public class Main {
    public static void main(String[] args) {
        Pajaro bird = new Pajaro("Lucas", 4, "Femenino", "Chico", "Gris"); //Instancia Pajaro
        Gato cat = new Gato("Alfredo", 5, "Masculino", "Mediano", "Azabache"); //Instancia Gato
        Perro dog = new Perro("Chicho", 10, "Maculino", "Pichichu", "Marron", "Grande");//Instancia Perro

        System.out.println("Llamo a la instancia Perro\n");
        dog.informacion();
        dog.hacerSondio();
        System.out.println(" ");
        System.out.println("Llamo a la instacia Gato\n");
        cat.informacion();
        cat.hacerSondio();
        System.out.println(" ");
        System.out.println("Llamo a la instancia Pajaron\n");
        bird.informacion();
        bird.hacerSondio();
    }
}