package day65_july14;

//if we pass type as Integer , T will become integer  normally we add T and Now we add integer and change it type
//T make it dynamic
public class Apple implements Edibile<Integer> {

	
	public static void main(String[] args) {
		
		Edibile<Integer> edible = new Apple(); 
		edible.eat(100);
		

	}

	@Override
	// since T is Integer data type 
		// this method will accept Integer 
	public void eat(Integer food) {
		
		System.out.println("eating " + food);
		
	}

}