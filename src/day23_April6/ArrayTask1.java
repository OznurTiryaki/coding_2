package day23_April6;

public class ArrayTask1 {

	public static void main(String[] args) {
		

		double[] numbers = new double[4]; 
		// or you can write like 
		//double []prices1 ;
		//prices1=new double [4];
		numbers [0] =  12.5 ;
		numbers [1] = 1.5 ;
		numbers [2] =  3.4;
		numbers [3] = 4.5;
		
		System.out.println(numbers [3]);  //yine sifirdan basladigi icin bir eksigi oluyor
		
		for (int x =0 ; x<4 ;x++) {
			
			System.out.println(numbers [x]);
		}
	}

}
