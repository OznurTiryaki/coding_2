package march_10;

public class LogicalOperator4 {

	public static void main(String[] args) {
		
		// LOGICAL OPERATOR PARACTICE
		
		 int score = 10 ;
		 
		 boolean result1 = score > 4 ;
		 
		 boolean result2 = score > 4  && score < 11 ;
		 
		 boolean result3 = score > 14  && score < 11 ;
		 
		 boolean result4 = score > 14  ||  score < 11 ;
		 
		 boolean result5 = score++ > 10  && score < 12 ; // score++ is 10 ,next time 11
		 
		 System.out.println( "the value of score right now : " + score );
		 
		 
		 //If we do 
		 
		 boolean result5a = score++ < 10  && ++score < 12 ; //11>10 false && oldugu icin islemin sagina bakmadan false veriyor
		 
		 //bu sebeple score sag tarafta artmayip, sol taraftaki degerinde hala 11 olarak kaliyor.
		 
		 // 10>10 --false &&  11<12 ---true/ one false one true---result false
		 
		 System.out.println( "the value of score right now : " + score );
		 
		 
		 
		 boolean result6 = ++score > 10 || score <12; //11 >10--false /11<12 --true----result true for OR
		 
		 boolean result7 = score++ > 10 || score <12; //10 >10 || 11<12---true--result true because OR
		 //if one is true, the result is true for OR

		 boolean result8 = score++ > 10  & ++score < 12; //10>10--false but still need to check other side  12<12 (count both side
				 
				 //and change de variable ---
		 
		 System.out.println("result is " + result1);
		 
		 System.out.println("result is " + result2);
				 
		 System.out.println("result is " + result3);
		 
		 System.out.println("result is " + result4);
		 
		 System.out.println("result is " + result5);
		 
		 System.out.println("result is " + result6);
		 
		 System.out.println("result is " + result7);
		 
		 System.out.println("result is " + result8);
	}
	}


