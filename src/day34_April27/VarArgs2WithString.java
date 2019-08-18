package day34_April27;

public class VarArgs2WithString {

	public static void main(String[] args) {

		printNames("Zukhra", "Finda", "Alina", "Odiljan", "Sharif",
				    "Ahmad", "Bayram", "Firdevs", "Ansar"); // it like create a array at that range in your method
       printNames("Ahmet Salih");
       
       printNames(null,"not empty","");
	}

	public static void printNames(String... names) {
   
		//names are treated as String [] that have  whatever variable numbers of arguments from method call
		
	//	System.out.println(names[0]);
	//	System.out.println(names[3]);
		//we can pass as may argument as possible for varArgs
		//including null for 
		System.out.println("you passed " + names.length + " arguments");
	}
	
	
}
