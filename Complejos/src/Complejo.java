class Complejo {

   //declaración de atributos
  protected double real, imaginario;
 

  //declaración de constructor
  public Complejo(double real, double imaginario) {
    this.real= real;
    this.imaginario= imaginario;
  }

  public double getReal() {
	  return real;
  }
	   
  public void setReal(double real){
	  this. real = real;
  }
	   
  public double getImaginario(){
	  return imaginario;
  }
	   
	  public void setImaginario(double imaginario) {
	  this.imaginario = imaginario;
	  }
  
  //declaración de métodos
 public String toString() {
	 return real + "+" + imaginario + "i";
  }
 
 public void suma(Complejo v) {
	 real = real + v.real;
	 imaginario = imaginario + v.imaginario;
 }
}