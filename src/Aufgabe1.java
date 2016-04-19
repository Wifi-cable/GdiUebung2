
import java.util.Scanner; // makes scanner useable in this class

public class Aufgabe1 { 		

	public static void main(String[] args) {		//main method the one and only
		Scanner bin = new Scanner(System.in); 		// new scanner
		System.out.println("Bitte eine ganze zahl eingeben um sie in Binär umgewandelt zu bekommen"); // input
		int zahlDez = bin.nextInt(); 		// uses the input, assigns variable
		calBin(zahlDez); 				//asigns the input to calBin
		DezHex dez =new DezHex(); 		//allows to use the dezHex class a. methods
		dez.dezToHex(zahlDez);
	}

	public static void calBin(int zahlDez){
		String stringBin=new String();
		String resultStr ="";
		while (zahlDez> 0){			//untill zahl dez is zero, loop
			if (zahlDez% 2==1){
			stringBin=stringBin+ 1; 
				// checks for rest,if yes than shows 1
				
			}
			else{
				
				stringBin=stringBin+ 0; //shows  a zero if no rest
			} zahlDez= zahlDez/2; 
			
		}
		for(int result=stringBin.length()-1; result>=0; result--){
			resultStr= resultStr + stringBin.charAt(result);
		
		}
		System.out.println("das ist das ergebniss : "+resultStr);
		GrayFromBin gray =new GrayFromBin();	//imports method from the grayFromBin class
		gray.convertToGray(resultStr);	//alowes usage
		
		
		
	}
}
