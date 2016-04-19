
import java.util.Scanner; // makes scanner useable in this class

public class Aufgabe1 { // should main be inside of class Aufgabe1?

	public static void main(String[] args) {
		Scanner bin = new Scanner(System.in); // new scanner
		System.out.println("Bitte eine ganze zahl eingeben um sie in Binär umgewandelt zu bekommen"); // input
		int zahlDez = bin.nextInt(); // uses the input, assigns variable
		calBin(zahlDez);
	}

	public static void calBin(int zahlDez){
		while (zahlDez <1);{
			int rest= (zahlDez %2); // new zahl zahlDez.a1 ?
			if (zahlDez% 2==1){  // checks for rest
				System.out.print(1); //shows a 1 if there is a rest
			}
			else{
				System.out.print(0);	//shows  a zero if no rest
			} // zahl is not a local variable. how to put global ones in local strings? 
		System.out.print("das ist die Binäre schreibweise"+ calBin+ "von" + zahlDez); 

		}

	}
