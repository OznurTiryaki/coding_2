package day56_june5;

public abstract class Animal {

	  public abstract void makeNoise(); 
	  
	}

	// what if sub class is also abstract class 
	// YOU ARE NOT REQUIRED TO IMPLEMENT ABSTRACT METHODS INHERITED FROM SUPER CLASS
	abstract class Mammals extends Animal {

	  // abstract sub class have option not to provide implementation 
	  // but you can optionally provide implementation so sub class of this class can use it as is 
	  // or override what's inherited 
	  @Override
	  public void makeNoise() {
	    System.out.println("mammals are making noise ");
	  }   
	  // abstract methods can be overloaded 
	  public abstract void eat(String foodName); 
	  public abstract void eat(String foodName, int amount); 
	  
	  
	}

	class Horse extends Mammals{
	  
	  @Override
	  public void makeNoise() {
	    System.out.println(" neigh neigh neigh");
	  }

	  @Override
	  public void eat(String foodName) {
	    System.out.println("eating "+ foodName);
	  }
	  //public abstract void eat(String foodName); 
	  @Override
	  public void eat(String foodName, int amount) {
	    System.out.println("another eat method");
	  }
	  
	  
	}