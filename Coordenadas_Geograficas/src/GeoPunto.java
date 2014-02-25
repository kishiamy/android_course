//creacion de la clase
public class GeoPunto {
	//creacion de atributos 
	public double longitud, latitud;
	
	//creacion del constructor
	public GeoPunto(double longitud, double latitud) {
		this.longitud = (int) (longitud * 1E6);
		this.latitud = (int) (latitud * 1E6);
	}
	
	public GeoPunto(int longitud, int latitud) {
		this.longitud = (longitud / 1E6);
		this.latitud = (latitud / 1E6);
	}
	
	public double getLongitud() {
		return longitud;
	}
		 
	public void setLongitud(double longitud){
		this. longitud = longitud;
	}
		 
	public double getLatitud(){
		return latitud;
	}
		 
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	
	//funcion que devuelve longitud y latitud de tipo string
	public String toString() {
		return longitud + "+" + latitud;
	}
	
	//funcion que crea la distancia de un punto a otro
	public double distancia(GeoPunto punto) {
	      final double RADIO_TIERRA = 6371000; // en metros
	      double dLat = Math.toRadians(latitud - punto.latitud);
	      double dLon = Math.toRadians(longitud - punto.longitud);
	      double lat1 = Math.toRadians(punto.latitud);
	      double lat2 = Math.toRadians(latitud);
	      double a =    Math.sin(dLat/2) * Math.sin(dLat/2) +
	                    Math.sin(dLon/2) * Math.sin(dLon/2) *
	                    Math.cos(lat1) * Math.cos(lat2);
	      double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
	      return c * RADIO_TIERRA; 
	}
}
