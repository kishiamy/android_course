import org.example.mislugares.Lugar;

class Principal {
    public static void main(String[] main) {
        Lugar z;
        z = new Lugar("Escuela Politécnica Superior de Gandía",
                "C/ Paranimf, 1 46730 Gandia (SPAIN)", "blabla", -0.166093, 38.995656,
                962849300, "http://www.epsg.upv.es",
                "Uno de los mejores lugares para formarse.", 3);
        
        System.out.println("Lugar: " + z.toString());
    }
}