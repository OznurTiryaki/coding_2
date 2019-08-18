package day60_june12;

public class Pizza {
	
	private String size;
	
	private int cheese;
			
	private int pepperoni;	
	
	private int ham;
	
	

	public String getSize() {
		return size;
	}



	public void setSize(String size) {
		this.size = size;
	}



	public int getCheese() {
		return cheese;
	}



	public void setCheese(int cheese) {
		cheese = cheese;
	}



	public int getPepperoni() {
		return pepperoni;
	}



	public void setPepperoni(int pepperoni) {
		pepperoni = pepperoni;
	}



	public int getHam() {
		return ham;
	}



	public void setHam(int ham) {
		this.ham = ham;
	}

      
	public Pizza(String size, int cheese, int pepperoni, int ham) {
		super();
		this.size = size;
		cheese = cheese;
		pepperoni = pepperoni;
		this.ham = ham;
	}



		public double calcCost() {
			
			double cost=0.0;
			
			if(size.equalsIgnoreCase("small")) {
			cost+= 10 +( 2*(getCheese()+getPepperoni ()+getHam ()));	
			}else if (size.equalsIgnoreCase("medium")) {
			cost+= 12+( 2*(getCheese()+getPepperoni ()+getHam ()));	
			}else if(size.equalsIgnoreCase("large")) {
				cost+= 14+( 2*(getCheese()+getPepperoni ()+getHam ()));		
			}	
				
			return cost;	
				
				
				
			}
			
			
			
			
			
			
			
			
			
		}
	