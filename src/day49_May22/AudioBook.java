package day49_May22;

public class AudioBook extends Book{

	/*int pageCount;
	String author;
	int chapterCount;
	double price;
	*/
	
    int audioLength ;
    
    public void play () {
    	//we are playing <author>'s book
    	//and it is <audioLength> hour long
    	
    	System.out.println("we are playing Book of " + author + "it is " + audioLength + " hour long");
    }
    
     
}
