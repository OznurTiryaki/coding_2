package march_10;

import java.util.Scanner;

public class SchoolGrades {

 public static void main (String[] args) {
		
		
	Scanner scan= new Scanner(System.in);
	
	//Declare 6 String variables: subject1,  subject2, subject3,  subject4, subject5, summary;	
		
	//String subject1, subject2, subject3,  subject4, subject5, summary;	
 
	//Declare 6 double variables: grade1,  grade2, grade3,  grade4, grade5, average;
	
	//Double grade1,  grade2, grade3,  grade4, grade5, average;
	
	
	//-Display prompt: "Please enter subject name number 1 and score for this subject"
	//Math
	//5.0
	
	System.out.println("Welcome to the Grader!" + "\n" + "Please enter subject name number 1 and score for this subject");
	
	String subject1 = scan.next();
	Double grade1 = scan.nextDouble();
	
	
	//-Display prompt: "Please enter subject name number 2 and score for this subject"
	//Biology
	//4.2
	
	System.out.println("Please enter subject name number 2 and score for this subject");
	
	String subject2 = scan.next();
	Double grade2 = scan.nextDouble();
	
   
	//Display prompt: "Please enter subject name number 3 and score for this subject"
    //English
    //4.4
	
	
	System.out.println("Please enter subject name number 3 and score for this subject");
	
	String subject3 = scan.next();
	Double grade3 = scan.nextDouble();
	
	//Display prompt: "Please enter subject name number 4 and score for this subject"
	//Chemistry
	//4.8
	
	
	System.out.println("Please enter subject name number 4 and score for this subject");
	
	String subject4 = scan.next();
	Double grade4 = scan.nextDouble();
	
    
	//Display prompt: "Please enter subject name number 5 and score for this subject"
	//Music
	//3.4
	
	System.out.println("Please enter subject name number 5 and score for this subject");
	
	String subject5 = scan.next();
	Double grade5 = scan.nextDouble();
	
	//Write the program that will calculate average grade.
	
	double average = (grade1 + grade2 + grade3 + grade4 + grade5) / 5 ;
	
	System.out.print( "Summary: " + subject1 +" - " +grade1+", " + " "+ subject2 + " - " +grade2 + ", "

			+ subject3 +  ", " +" - " + grade3 +", " +subject4 +" - " +grade4+ subject5 +" - " +grade5);

 System.out.println("\nYour average score is: "+average+ "\n"+"Thank you for using Grader!" +
                             "\n" + "Goodbye!");
 

		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
