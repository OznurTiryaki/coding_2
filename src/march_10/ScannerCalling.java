package march_10;

import java.util.Scanner;

public class ScannerCalling {

	public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
  
  int areaCode = input.nextInt(); 
  
  int localNumber = input.nextInt();
  
  String phoneNumber = "(" +areaCode+ ") -" + localNumber ;
   
  System.out.println("Calling number "+ phoneNumber);
   
 }

 
 
}