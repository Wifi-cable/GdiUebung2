
package Uebung2; // how to name the package correctly? 
import java.util.Scanner; // makes scanner useable in this class

public class Aufgabe1 { // should main be inside of class Aufgabe1?

	public static void main(String[] args) {
		Scanner bin = new Scanner(System.in);	 // new scanner
		System.out.println("Bitte eine ganze zahl eingeben um sie in Binär umgewandelt zu bekommen"); //input
		 public int zahl = bin.nextInt(); //uses the input, assigns varable
		berechneBin(zahl);
		}
		public static void berechneBin(int dez){
			
		// how to make it recursive, assingning the zahl variable again and again till a zero is reached?
		int rest= (dez %2);
		int ergebniss = dez/2;//divides input by 2 and checks for a rest.
		if (dez% 2==1){  // checks for rest
			System.out.print(1); //shows a 1 if there is a rest
		}
		
			else{
			System.out.print(0);	//shows  a zero if no rest
			} // zahl is not a local variable. how to put global ones in local strings? 
		System.out.print("das ist die Binäre schreibweise"+ ergebniss+ "von" + zahl); 
/* were to put the next class for the object aufgabe2 and aufgabe3?
		does that require 3 different classes?*/
	/* how to track java in git? commit as package?*/
		}

	}

	


