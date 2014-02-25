class Principal {
    public static void main(String[] main) {
        ComplejoAmpliado z, w;
        z = new ComplejoAmpliado(-1.5, 0);
        w = new ComplejoAmpliado(-1.2, 0);
        z.suma(w);
        System.out.println("Complejo: " + z);
    }
}