package day52_May28;

public class Person {
	
		  private String name;  //(it is feature of this class-this features access modifiers private)
		  private int age;
		  
		  
		  public Person(String name, int age) {
		    this.name = name;
		    this.age = age;
		  }


		  public String getName() {
		    return name;
		  }


		  public void setName(String name) {
		    this.name = name;
		  }

		  public int getAge() {
		    return age;
		  }


		  public void setAge(int age) {
		    this.age = age;
		  }
		  
		  
		  
		  @Override
		  public int hashCode() {
		    final int prime = 31;
		    int result = 1;
		    result = prime * result + age;
		    result = prime * result + ((name == null) ? 0 : name.hashCode());
		    return result;
		  }
		  
		  //from now one, if we have two objects with same values
		  //we can consider them equals

		  @Override
			public boolean equals(Object obj) {
				if (this == obj) // if 2 objects point to the same place in the memory
					return true;
				if (obj == null) // we are checking if object is not null
					return false;
				if (getClass() != obj.getClass()) //we are checking if both objects are from the same class
					return false;
				Person other = (Person) obj; // casting
				//we are verifying that all instance variables are the same
				return other.age == this.age && other.name.equals(this.name);  //if age is the same, name is the same , it is true.
			}


		  //method can be overridden, if we have a same method in parent class
		  //since Object is a parent class for all classes in java
		  //we can override methods of Object class.
		  @Override //this is an annotation , and green triangle means that method was overridden
		  public String toString() {
		    return "Person [name=" + name + ", age=" + age + "]";
		  }
		  
		  
		}


