package day23_April6;

public class WarmUp2 {

	public static void main(String[] args) {
		
  //reverse

		String str = "Goksel" ; 
		String reversed = "" ; 
		
		for (int i = str.length()-1 ; i>=0  ; i--) {
		
		
			reversed += str.substring(i,i+1) ; 
			
			//System.out.print( str.substring(i,i+1)   );
		
		}
		System.out.println(reversed);
		
//		reversed += str.substring(0,0+1) ; 
//		reversed += str.substring(1,1+1) ; 
//		reversed += str.substring(2,2+1) ; 
//		reversed += str.substring(3,3+1) ; 
//		reversed += str.substring(4,4+1) ; 
		
		
		
	}
}