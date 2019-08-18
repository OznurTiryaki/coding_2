package day32_April23;

public class Method1SalaryWithReturn {

	public static void main(String[] args) {
		
		// Task 1 : create a method giveMe6DigitSalary that return long 
				 // then return the number you have in mind 
				 
				 // call this method twice and 
				 // calculate how much you will be making in 2 years 
				 
				 // giveMe6DigitSalary() ---> 1st year salary
				 //  giveMe6DigitSalary() ---> 2nd year salary
		         // SECOND YEAR 10% RAISE 
		
		
		long firstYearsalary = giveMe6DigitSalary (150000L);
		long secondYearsalary = (long) (giveMe6DigitSalary (150000L) + (giveMe6DigitSalary (150000L) * 0.10));
		
		System.out.println(firstYearsalary );
		System.out.println(secondYearsalary);
		System.out.println(firstYearsalary+ secondYearsalary);
		
		
	}
      public static long giveMe6DigitSalary (long salary) {
    	 salary =180000L;
    	 return salary;
    	 
    	 
      }
}
