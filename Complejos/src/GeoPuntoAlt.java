class GeoPuntoAlt extends GeoPunto {
	
	 private double altura;
  
	public GeoPuntoAlt(double longitud, double latitud) {
		super(longitud, latitud);
		altura = 0;
	}
	
	public GeoPuntoAlt(double punto) {
	    super(punto, 0);
	    altura = 0;
	  }
	
	public double getAltura() {
		return altura;
	}

	public Object setAltura(double altura) {
		this.altura = altura;
		return this.altura;
	}

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
	
	public double distancia(GeoPuntoAlt punto) {
		double distancia_nueva, diferencia_alturas;
		double distancia_anterior = super.distancia(punto) * super.distancia(punto);
		diferencia_alturas = (altura - punto.altura) * (altura - punto.altura);
		distancia_nueva = Math.sqrt(distancia_anterior + diferencia_alturas);
		return distancia_nueva;
	}

}
