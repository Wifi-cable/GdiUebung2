
public class GrayFromBin {

	public void convertToGray(String bin){
		int binArray[] = new int [bin.length()];
		for(int i=0; i<bin.length(); i++){ //new variable bin? but it is the scanner input
			binArray [i] =(int)bin.charAt(i)-(int)'0';
	}
		int grayArray[]=new int [bin.length()];
		for (int shift=1; shift<binArray.length-1; shift++){
			grayArray[shift]=binArray[shift]^binArray[shift+1];
		}
		System.out.println("Der graycode nicht gaycode lautet: ");
		for (int shift=0; shift<grayArray.length;shift++){// print array to string
		System.out.print(grayArray[shift]);
		}
}
	
}