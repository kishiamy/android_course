
class Principal {
    public static void main(String[] main) {
    	Object lista[] = new Object[4];
    	GeoPuntoAlt g = new GeoPuntoAlt(1.2, 5);
    	g.setAltura(3E7);
    	GeoPuntoAlt h = new GeoPuntoAlt(2.7, 3.2);
    	h.setAltura(1E-8);
    	
    	lista[0] = new Complejo(-1.5, 3.0);
    	lista[1] = new GeoPunto(3.5, 7.2);
    	lista[2] = g;
    	lista[3] = h;
    	
    	for(int i = 0; i < lista.length; i++) {
    		  System.out.println("Objeto " + i + ": " + lista[i]);
    		  if(lista[i] instanceof GeoPuntoAlt && ((GeoPuntoAlt)lista[i]).getAltura() > 1E6) {
    		    System.out.println("punto elevado!");
    		  }
    		}
    }
}