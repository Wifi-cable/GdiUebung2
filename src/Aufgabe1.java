
import java.util.Scanner; // makes scanner useable in this class

public class Aufgabe1 { // should main be inside of class Aufgabe1?

	public static void main(String[] args) {
		Scanner bin = new Scanner(System.in); // new scanner
		System.out.println("Bitte eine ganze zahl eingeben um sie in Binär umgewandelt zu bekommen"); // input
		int zahlDez = bin.nextInt(); // uses the input, assigns variable
		calBin(zahlDez);
	}

	public static void calBin(int zahlDez){
		String stringBin=new String();
		String resultStr ="";
		while (zahlDez> 0){
			//int rest= (zahlDez %2); // new zahl zahlDez.a1 ?
			
			if (zahlDez% 2==1){
			stringBin=stringBin+ 1; 
				// checks for rest
				
			}
			else{
				
				stringBin=stringBin+ 0; 
				 //shows  a zero if no rest
			} zahlDez= zahlDez/2; 
			
		}
		for(int result=stringBin.length()-1; result>=0; result--){
			resultStr= resultStr + stringBin.charAt(result);
		
		}
		System.out.println("das ist das ergebniss : "+resultStr);
		GrayFromBin gray =new GrayFromBin();
		gray.convertToGray(resultStr);
		
	}
}
