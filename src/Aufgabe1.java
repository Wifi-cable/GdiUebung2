
package Uebung2; // how to name the package correctly? 
import java.util.Scanner; // makes scanner useable in this class

public class Aufgabe1 { // should main be inside of class Aufgabe1?

	public static void main(String[] args) {
		Scanner bin = new Scanner(System.in);	 // new scanner
		System.out.println("Bitte eine ganze zahl eingeben um sie in Binär umgewandelt zu bekommen"); //input
		int zahlDez = bin.nextInt(); //uses the input, assigns varable
		berechneBin(zahlDez);
		}
		public static void berechneBin(int zahl){
		do while rest <1;
		int rest= (zahlDez %2);
		if (dez% 2==1){  // checks for rest
			System.out.print(1); //shows a 1 if there is a rest
		}
		
			else{
			System.out.print(0);	//shows  a zero if no rest
			} // zahl is not a local variable. how to put global ones in local strings? 
		System.out.print("das ist die Binäre schreibweise"+ ergebniss+ "von" + zahl); 

		}

	}

	


