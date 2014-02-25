class Principal {
    public static void main(String[] main) {

        GeoPuntoAlt x = new GeoPuntoAlt(-1.5, 1.0);
        GeoPuntoAlt y = new GeoPuntoAlt(-1.2, 2.0);
        x.distancia(y);
        System.out.println("Distancia: " + x);
    }
}