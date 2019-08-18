package day15_March23;

public class CastingPrimitivesRewiew {

	public static void main(String[] args) {
		
		// char,boolean, 
		//byte,short, int ,long, float,double
        
		//type conversion--casting
		
		//byte--->upcasting /type widening
		
		byte b = 12;
		
		int i = b ; //this happen implicitly by compiler 
		
		int y = (int)b ;   //explicitly by programmer upcasting is not necessar like downcasting
		
		//int---->byte downcasting / type narrowing 
		
		int a =20 ;  //20 numarasini normalde alabilir ama buna bakilmiyor, int oldugu icin casting yapmak gerekiyor
		
		byte c = (byte)a ; //byte in int i icine alabilmesi casting yapmak zorundasin
		
		double d = 12.12;
		int k = (int)d;  //its mean I know i will lose some information when I make down casting
		
		System.out.println(k); //print just 12
		
		
	}

}
