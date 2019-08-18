package day22_April3;

public class SubstringPractice {

	public static void main(String[] args) {
		
		 
		 String song = "Ba Ba Black Sheep Ba";
		 
		int ba= song.indexOf("Ba");
		System.out.println(ba);
		int secondBa= song.indexOf("Ba", ba+2);
		System.out.println(secondBa);
		int thirdBa = song.indexOf("Ba", secondBa+2);	//we add two because Ba two word
		System.out.println(thirdBa);
	}

}
