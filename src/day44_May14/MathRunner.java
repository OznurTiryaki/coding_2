package day44_May14;

import java.util.Arrays;

public class MathRunner {

	public static void main(String[] args) {
		
		MathEquasion math1=new MathEquasion(120, 10, '+');  
		MathEquasion math2=new MathEquasion(13, 12, '-');
		MathEquasion math3=new MathEquasion(120, 10, '/');
		MathEquasion math4=new MathEquasion(12, 10, '*');

		
		System.out.println(math1);  //ikisi de ayni sey
		System.out.println(math2.toString());
		
		math1.setOperator('*');
		math1.calculate();
		System.out.println(math1);
		
		
		//MathEquasion[] arr = new MathEquasion[] {math1,math2, math3, math4  }; 
		MathEquasion[] arr = {math1,math2, math3, math4  }; 
		
		for(MathEquasion each : arr) {
			each.calculate();
			System.out.println( each.getResult() ); //burada butun objelerin islem yapilmis halini goruyoruz.
			System.out.println(each);
		}
		
		for(MathEquasion each : arr) {
			each.calculate();
			System.out.println( each.getResult() );
			System.out.println(each);
		}
		//guzel bir sekilde print etme sebebi toString methodu, onu silince hashcode oluyor.
		
		System.out.println(Arrays.toString( arr) );  //burada da tum objectleri tek tek array icinde yaziyor
		

	}

}
