package system;
 
import java.util.Scanner;  
import java.util.Random; 

public class Examen {
	      
	public static void main(String []args) {  
		 
		String [] nombres = {"Courtois", "Hakimi", "Van Dijk", "Modric", "De Bruyne", "Casemiro", "Messi", "Benzema", "Haaland", "Mbappe"};
		String [] trabajo = {"true","   ","true","true","   ","true","   ","true","true","   "};
		String [] casa = {"   ","true","true","   ","   ","true","true","   ","   ","true"};  
		String [] coche = {"true","   ","true","   ","true","true","   ","true","true","   "};
		String [] mascota = {"true","true","true","   ","   ","true","   ","true","true","   "}; 
		 
		Random random = new Random(); 
		aleatorio [] Persona = new aleatorio [10];    
		 
		for (int i=0; i<10; i++) {  
			int numRandom = random.nextInt(10); 
			 
			while (nombres[numRandom] == "CERO") {  
				numRandom = random.nextInt(10); 
			}
			Persona[i] = new aleatorio(); 
			nombres[numRandom]= "CERO";  
			Persona[i].setNombre (nombres [numRandom]);  
			
			Persona[i].setTrabajo(trabajo [numRandom]);  
			Persona[i].setCasa(casa [numRandom]); 
			Persona[i].setCoche(coche [numRandom]);    
			Persona[i].setMascota(mascota [numRandom]); 
		}
		System.out.println("ADIVINA QUIÉN"); 
		System.out.println("La lista de las 10 personas son: ");
		
		for (int i=0; i<10; i++) {
			System.out.println(i+ ". " +Persona[i].getNombre() +": "+Persona[i].getTrabajo() +" "+Persona[i].getCasa() +" "+Persona[i].getCoche() +" " +Persona[i].getMascota());
		}
		
		int protagonista = random.nextInt(10); 
		@SuppressWarnings("resource")
		Scanner elegir = new Scanner (System.in); 
		int preguntar;  
		String atributo = ""; 
		
		System.out.println("Elige el número de tú primer pregunta: ");
		
		for(int n=3; n>0; n--) {
			System.out.println("Intentos restantes" +n); 
			System.out.println("1. ¿Él personaje tiene trabajo?: ");
			System.out.println("2. ¿Él personaje tiene casa?: ");  
			System.out.println("3. ¿Él personaje tiene coche?: ");
			System.out.println("4. ¿Él personaje tiene mascota?: ");
			
			preguntar = elegir.nextInt(); 
			
			if (preguntar == 1) {
				atributo = Persona [protagonista].getTrabajo(); 
				System.out.println("Tú personaje tiene trabajo");
				for (int i=0; i <10; i++) {
					while (atributo != Persona[i].getTrabajo()) {
						Persona[i].setNombre("CERO");
					}
				}
			if (preguntar ==2) {
				atributo = Persona [protagonista].getCasa(); 
				System.out.println("Tú personaje tiene casa");
				for (int i=0; i <10; i++) {
					while (atributo != Persona[i].getCasa()) {
						Persona[i].setNombre("CERO");
					}
			} 
			}
			
			if (preguntar ==3) {
				atributo = Persona [protagonista].getCoche(); 
				System.out.println("Tú personaje tiene coche"); 
				for (int i=0; i <10; i++) {
					while (atributo != Persona[i].getCoche()) {
						Persona[i].setNombre("CERO");
					}
			}
			}
			
			if (preguntar ==4) {
				atributo = Persona [protagonista].getMascota(); 
				System.out.println("Tú personaje tiene mascota");
				for (int i=0; i <10; i++) {
					while (atributo != Persona[i].getMascota()) {
						Persona[i].setNombre("CERO");
					}
		 	}
			}
			System.out.println("Elegiste mal al personaje: "); 
		}  
		if (atributo =="true") {
			System.out.println("VERDADERO"); 
		}
		else { 
			System.out.println("FALSO"); 
		} 
		System.out.println("Las personas restantes son "); 
		
		for (int i=0; i<10; i++) {
			while (Persona[i].getNombre() != null) { 
				System.out.println(i+ ". " +Persona[i].getNombre() +": "+Persona[i].getTrabajo() +" "+Persona[i].getCasa() +" "+Persona[i].getCoche() +" "+Persona[i].getMascota());
				
			}
		}
		System.out.println("Elige el indice de tu protagonista");
		int eleccion = elegir.nextInt(); 
		
		if (eleccion == protagonista) {
			System.out.println("Tú personaje era: " +Persona[protagonista].getNombre()); 
			System.out.println("¡EN HORA BUENA! Tú personaje es correcto"); 
		}
		else {
			System.out.println("LO SIENTO Tú personaje no es correcto"); 
		}
		System.exit(0);
	}

}
}
