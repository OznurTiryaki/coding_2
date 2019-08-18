package day30_April17;

public class Method5WithParameters {

	
		public static void mainReportName (String name, String lastName) {
			   System.out.println(name.length());
			   System.out.println(lastName.length());
			  String fullName= (name + " " + lastName);
			  System.out.println(fullName);
			  
			  System.out.print("Your initial is " + name.charAt(0)+ " ");
			  System.out.println(lastName.charAt(0));
			  
			  String reversed="";
			  for (int x=fullName.length()-1 ; x>=0 ;x--) {
				  reversed += fullName.charAt(x);
			  }
			  
			  System.out.println(reversed);
				  }


		public static void main(String[] args) {
			
			 mainReportName ("Oznur", "Tiryaki");	
							

		}

	   

	}

	