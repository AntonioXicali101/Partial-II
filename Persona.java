package system;

import java.util.Random;  
 
public class Persona {

	private String trabajo;     
	private String  casa;  
	private String  coche;      
	private String  mascota;  
	  
	Random aleatorio = new Random ();
	String  random0 = aleatorio.toString();
	String  random1 = aleatorio.toString();
	String  random2 = aleatorio.toString();
	String  random3 = aleatorio.toString();
	
	public Persona() { 
		this.trabajo = random0; 
		this.casa = random1;  
		this.coche = random2; 
		this.mascota = random3;

	}
	
	public String getTrabajo() { 
		return trabajo; 
	}
	public String getCasa() {
		return casa; 
	}
	public String getCoche() {
		return coche; 
	}
	public String getMascota() {
		return mascota; 
	}
	
}
