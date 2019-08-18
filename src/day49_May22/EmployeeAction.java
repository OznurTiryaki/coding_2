package day49_May22;

public class EmployeeAction {

	public static void main(String[] args) {
		
	//we did here multiple inheritance----> Employee---> FullTimeEmployee--->Teacher

		

		
		
     Employee e= new Employee ();
     //e can only access title and id
     
     System.out.println(e.toString());  //it gave us hash code because it include hashcode in behind, 
     //when they create a method
     System.out.println(e);
     
     FullTimeEmployee f= new FullTimeEmployee ();
       //f include salary and insurance;\
     
    f.salary=140000;
    f.insurance="Full Coverage";
    f.setTitle("SDET");   //it was private , to access it we did private 
    f.setId(100);
     
     Teacher t= new Teacher ();
     
     //t include teacherId  and energyLevel;
	
   //  t.setTitle(title); to call it from teacher class, also we just call with setter getter because private
	
     EmployeeAction a= new  EmployeeAction();
     
	
	}

}
