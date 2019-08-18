package day47_May19;


//import is used to import the type that not under the package 

//static import 
//-->> is used to import the visible static members of another class 
// we use keyword import static yourClasname.staticMember; 
// just like importing the class, we can use .* to import all static memb


import static day47_May19.StudentUtility.*;
import static day47_May19.StudentUtility.displayAllStudents;;

public class StudentUtilityRunner {

	public static void main(String[] args) {
		
				
		 
		StudentUtility.displayAllStudents();   //when we import static , we dont need to use class name befor
		
		displayAllStudents();  
		
		System.out.println("_______________________");
		
		System.out.println("_______________________");
		//if we do this in same class we need to do displayAllStudents();
		//we don't need to write class name
		
		StudentUtility.addStudents("Nazenin");
		StudentUtility.displayAllStudents();  //now we will see nazenin on list
		
		System.out.println("_______________________");
		
		StudentUtility.removeStudents(3);
		StudentUtility.displayAllStudents(); //artik listeden Mustafayi cikardi
		
		System.out.println("_______________________");
		
		StudentUtility.resetStudent();
		StudentUtility.displayAllStudents();
		
	}

}
