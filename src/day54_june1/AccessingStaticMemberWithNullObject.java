package day54_june1;

public class AccessingStaticMemberWithNullObject {
	
	public static void main(String[] args) {
//		
//		
//		 SoccerFinal s1 = new SoccerFinal(); 
//		 
//		 s1.printScore();
//		 s1.printcupName();
//		 
		 
		/// static members does not need an object to be accessed
		// className.membername -- static way should be used 
		// non-static way works but not encouranged 
		 SoccerFinal s2 = null;  
		 //s2.printScore();
		 s2.printcupName();
		 System.out.println(s2.cupName) ; 


	}

}