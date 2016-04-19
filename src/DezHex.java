import java.util.Scanner;
public class DezHex {
	


	public void dezToHex(int dez2Hex) {		//don't use main if in same folder
		
		
		int rem;  //remembers or stores remainer
		String hexMem=""; //stores the result
		char [] hexDigits ={ '0', '1', '2', '3', '4', '5', '6', '7', 
				'8', '9', 'A', 'B', 'C', 'D', 'E', 'F'		//content of the array
				  };
		while (dez2Hex >0){		// loop until it is zero
		rem=dez2Hex%16;			// does modulo 16 on the input
		hexMem=hexDigits [rem]+hexMem;	//takes the stored remainer the array hexDigits adds remebered result
		dez2Hex=dez2Hex/16;		//divides by 16
		
		}
		System.out.println(dez2Hex+" ist in Hexadezimal schreibweise: "+hexMem);		//shows content threw print
	}

}
