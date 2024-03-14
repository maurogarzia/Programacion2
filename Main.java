public class Main {
    public static void main(String[] args) {
        Auto lambo = new Auto("Mauro", 2, 4, true);
        Camion cami = new Camion("Mauro",2,4,16.5F);

        lambo.caracteristicas();
        cami.caracteristicas();
    }
}