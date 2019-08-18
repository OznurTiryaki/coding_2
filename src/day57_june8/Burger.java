package day57_june8;

public class Burger implements Edible {
	
   String name;
   String size;
    
   public Burger(String name, String size) {

	this.name = name;
	this.size = size;
}

@Override
public String toString() {
	return "Burger [name=" + name + ", size=" + size + "]";
}

@Override
public void eat() {
	System.out.println("Spartan eating Burger");
}

   
   
}
