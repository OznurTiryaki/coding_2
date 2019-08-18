package day57_june8;


import java.util.*;

public class ChromeDriver implements WebDriver {
	
  int screenSize;
  double positionX;
  
  //anytime I cretae a Chromebook object
  //it shoul automativcally open the browser
  //So where shoul I put==>>CONSTRUCTOR
  public static void main(String[] args) {
	  
//	  ChromeDriver c = new ChromeDriver(24, 6.2);
//	  c.quit();
//	  
	  ChromeDriver c1 = new ChromeDriver();
//	  c1.navigateTo("www.cybertekschool.com");
//	  c1.findElementByID(100);
//	  c1.findElementsByTagName("p");
	  
	  ArrayList<String> allelements = c1.findElementsByTagName("3");
	  System.out.println(allelements);//
	  c1.clickButton("abc");//needs to overriden without default word
	  System.out.println("-----");
	  c1.clickButtonAndEnterText();
	  
	  WebDriver.showPurpose();
	  //showPurpose();
	  
}
//  public static void showPurpose() {
//      System.out.println("purpose is " + PURPOSE);
//    }
  
public ChromeDriver(int screenSize, double positionX) {
	super();
	this.screenSize = screenSize;
	this.positionX = positionX;
	openBrowser();//not abstract anymore,implemented
}

public ChromeDriver() {
System.out.println("Creating ChromeDriver with no arg");
	openBrowser();//not abstract anymore
}
@Override//inherited
public void openBrowser() {
	System.out.println();
	
}

@Override
public void navigateTo(String url) {
	System.out.println("navigating To URL "+ url);
}

@Override
public void quit() {
	System.out.println("Closing browswer");
	
}

@Override
public String findElementByID(int id) {
	System.out.println("looking for element hard with id "+ id);
    return "my Element with id "+id;
	
	
}

@Override
public ArrayList<String> findElementsByTagName(String tagName) {
	System.out.println("looking for"
	        + "all the elements with tagName "+ tagName);
	    
	    ArrayList<String> allElements = new ArrayList<String>(); 
	    allElements.add("first checkbox"); 
	    allElements.add("another textbox");
	    allElements.add("sign up link");
	    
	    return allElements; 
}  


	   

////default kelimesi olmaz sub classda
@Override
public void clickButtonAndEnterText(){//default inherited method

clickButton("MY BLUE BUTTON"); 
//System.out.println("clickButtonAndEnterText DO YOUR IMPLEMENTATION WITHOUT BREAKING");
System.out.println("Entering Cybertek");
quit(); 

} 



  ///////////////////////
  
//import java.util.ArrayList;
//
//public class ChromeDriver implements WebDriver{
//
//  int screenSize;
//  double positionX;
//  
//  public ChromeDriver(int screenSize, double positionX) {
//    this.screenSize = screenSize;
//    this.positionX = positionX;
//  }
//
//  
//  
//  
//  
//  
//  @Override
//  public void openBrowser() {
//  
//    System.out.println("Opening browswer");
//    
//  }
//
//  @Override
//  public void navigateTo(String url) {
//    System.out.println("navigating To URL "+ url);
//  }
//
//  @Override
//  public void quit() {
//    System.out.println("Closing browswer");
//  }
//
//  @Override
//  public String findElementByID(int id) {
//    System.out.println("looking for element hard with id "+ id);
//    return "my Element";
//  }
// 
//  @Override
//  public ArrayList<String> findElementByTagName(String tagName) {
//    
//    System.out.println("looking for"
//        + "all the elements with tagName "+ tagName);
//    
//    ArrayList<String> allElements = new ArrayList<String>(); 
//    allElements.add("first checkbox"); 
//    allElements.add("another textbox");
//    allElements.add("sign up link");
//    
//    return allElements; 
//     
//  
}