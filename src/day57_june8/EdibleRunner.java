package day57_june8;

public class EdibleRunner {

	public static void main(String[] args) {
		
        Burger b1= new Burger ("Bigmac", "Medium");
        
        
        b1.eat();
        
        IceCoffee i1=new IceCoffee ("Tall");
        
        i1.eat();
        i1.drink();
	}

}
