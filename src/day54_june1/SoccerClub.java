package day54_june1;

import day54_june1.soccer.Stadium;

// HAS-A RELATIONSHIP CAN BE BUILD USING INSTANCE VARIABLE WITH REFERENCE TYPE
	// WHEN SoccerClub define has-a relationship with 
//	 	Stadium by putting Stadium as instance variable 
	// it has access to everything  visible that Stadium object can have 

	// WHAT DO WE CALL HAS-A RELATIONSHIP COMPARED TO INHERITANCE FOR IS-A 
	// COMPOSITION 

	public class SoccerClub {

		private int playerCount; 
		private String name; 
		private Stadium st;
		
		public SoccerClub(int playerCount, String name, Stadium stadium) {
			this.playerCount = playerCount;
			this.name = name;
			this.st = stadium;
		}
		
		public char getInitial() {
			return  name.charAt(0);  
		}
		
		public int getStatdiumCapacity() {
			//return st.capacity ;	
			return st.getCapacity(); 
		}
		
		public static void main(String[] args) {
			
			Stadium st = new Stadium(10000, "Burger"); 
			System.out.println( st.toString() );
			
			SoccerClub chelcea = new SoccerClub(25, "Chelcea", st); 
			System.out.println(  chelcea.getInitial()  );
			
			System.out.println(chelcea.toString());
			System.out.println(  chelcea.getStatdiumCapacity()  );
			
		}
		

		

		@Override
		public String toString() {
			return "SoccerClub [playerCount=" 
					+ playerCount + ", "
					+ "name=" + name 
					+ ",stadium=" + st.toString() + "]";
		}


		public int getPlayerCount() {
			return playerCount;
		}

		public void setPlayerCount(int playerCount) {
			this.playerCount = playerCount;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Stadium getStadium() {
			return st;
		}

		public void setStadium(Stadium stadium) {
			this.st = stadium;
		} 
		
		
		
		
		// ADD 3 ARGS CONSTRUCTOR 
		// ADD GETTERS AND SETTERS 
		// ADD TOSTRING METHOD 
		// CREATE A MAIN METHOD 
		// CREATE YOUR FAVORITE SOCCER CLUB OBJECT 
		// AND TAKE SOME ACTIONS 
		
	}

