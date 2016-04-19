import java.util.Scanner;
public class dezHex {
	
	private static Scanner dez;

	public static void main(String[] args) {
		dez = new Scanner(System.in);
		System.out.println("bitte ganze dezimalzahl eingeben");
		int dez2Hex= dez.nextInt();
		
		int rem;  //remembers or stores remainer
		String hexMem=""; //stores the result
		char [] hexDigits ={ '0', '1', '2', '3', '4', '5', '6', '7', 
				'8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
				  };
		while (dez2Hex >0){		// loop until it is zero
		rem=dez2Hex%16;	// does modulo 16 on the input
		hexMem=hexDigits [rem]+hexMem;	//takes the stored remainer the array hexDigits adds remebered result
		dez2Hex=dez2Hex/16;
		
		}
		System.out.println(dez2Hex+"ist in Hexadezimal schreibweise"+hexMem);
	}

}
