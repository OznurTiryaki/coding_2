package day45_May15;

public class MathEquasion2RunnerClass {

	public static void main(String[] args) {
		
		    
		    MathEquasion2 math1=new MathEquasion2(120, 10, '+');
		    //MathEquasion2 math2=new MathEquasion2(13, 12, '-');
		    
		    math1.calculate();  //we just call print , it is not include anything print
		    System.out.println( math1.getResult() );
		    
		    math1.calculateX(100, 200);
		    System.out.println( math1.getResult() );
		    
		    
		    
		    
//		    math2.calculate();
//		    System.out.println( math2.getResult() );
		//    

		  }

		}
