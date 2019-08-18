package day65_july14;

//if we pass type as String , T will become String 
//T dynamic type happen String now.
public class Orange implements Edibile<String> {

	@Override
	// since T is String data type 
	// this method will accept String 
	public void eat(String food) {
		
		System.out.println("eating food " + food);
		
	}
	
	public static void main(String[] args) {
		
		Edibile<String> edible = new Orange(); 
		edible.eat(" Eveything");
		
	}

}