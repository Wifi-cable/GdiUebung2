
public class GrayFromBin {

	public void convertToGray(String bin){
		int binArray[] = new int [bin.length()]; 		//array stores string of binary conversion output
		for(int i=0; i<bin.length(); i++){ 				//lenght of array is lenght of string. always fits
			binArray [i] =(int)bin.charAt(i)-(int)'0';
	}
		int grayArray[]=new int [bin.length()];			//array that reverses the order 
		for (int shift=1; shift<binArray.length-1; shift++){ 	//shifts array cont. one to the left
			grayArray[shift]=binArray[shift]^binArray[shift+1];  	//^ means EXOR exclusive 1,0 or 0,1 but not both or neither
		}
		System.out.println("Der graycode nicht gaycode lautet: ");
		for (int shift=0; shift<grayArray.length;shift++){		// print array to string
		System.out.print(grayArray[shift]);
		}
}
	
}