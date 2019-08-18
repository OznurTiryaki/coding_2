package day16_March24;

public class AnotherIndexOf {

	public static void main(String[] args) {
		
     String str = "Ahmet Omar Al Alousi";

     System.out.println(str.indexOf("A"));      //bize 0 yani location 1 i verdi.
     
     System.out.println(str.indexOf("A" ,1) );  //11 verdi yani ikinci A yi verdi. Case matter unutma!
     
     System.out.println(str.indexOf("A" ,10) ); //11 verdi yine cunku 11 e kadar sadece 1 de ve 11 de vardi.
     
     System.out.println(str.indexOf("A" ,11) ); //gave 11 because it is exactly 11 after 12 it gave other A
     
     System.out.println(str.indexOf("A" ,12) );
     
     //second space is between first space and second space
     //third word is between first second space and forth space
     
     //give me part of string from location 6 till 10
     
     int space1 = str.indexOf(" ");
     int space2 = str.indexOf(" ", space1 +1); //burda space 2 yu bulduk
     int space3 = str.indexOf(" ", space2 +1); 
     
     String word2 =str.substring(space2+1,space3); //ikinci spacei bulduktan sonra 
              // ikinci spaceden sonra 3. bosluga kadar olani bulduk
    
     System.out.println(word2);
	}

}
