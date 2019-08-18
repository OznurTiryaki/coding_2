package day43_May12;

public class Vehicle {

//	Encapsulation
//
//
//	Good Encapsulation practice making instance  fields private 
//	and providing public getter/ setter for the field for success and modify
//
//	Getter—>> Method for getting the value of your fields 
//	and name is specifically recommended in getFieldName() format and return the value of field.
//
//
//
//	Setter—>> a Method for setting the value of your field and name 
//	specifically suggested to have setFieldName(dataType fieldName)and
//	it  will set new value for the field and it does not return value
//create a method and increase speed /task       

	
/*this keyword ;
 * is used to address the current object|instance being worked on
 * to do otomaticaly getters /setters select source>generate>getter and setters
 */
	
	   private String make;
       private String model;
       private int year;
       private String color;
       private int speed;
       

	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void updateIncrease (int increasedBy) {
		
		
		 for (int i = 1; i <= increasedBy; i++) {

		      speed++ ;
		      System.out.print(speed + "->");
		    }

		    System.out.println();

		  }
		  
		  public void decreaseSpeed(int decreaseBy) {
		    
		    for (int i = 1; i <= decreaseBy; i++) {

		      speed-- ;
		      System.out.print(speed + "->");
		    }

		    System.out.println();

		    
		  }
}
