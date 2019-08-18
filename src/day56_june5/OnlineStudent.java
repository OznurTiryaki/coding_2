package day56_june5;



//IMPLEMENTING A INTERFACE ALSO BUILDING A PARENT CHILD RELATIONSHIP 

//WE USE IMPLEMENTS KEYWORD RATHER THAN EXTENDS used by a class
//the class must implements every abstract method 

public class OnlineStudent implements Teachable{

//public static final boolean STUDY_HARD = true; 
 
@Override
public void canLearn() {
 System.out.println("can learn by hardwork");
}



@Override
public void doHomeWork() {
 System.out.println("will do all homeworks");
}


public static void main(String[] args) {
 
 System.out.println( Teachable.STUDY_HARD  );
 System.out.println(STUDY_HARD);
 
 OnlineStudent o = new OnlineStudent(); 
 o.canLearn();
 o.doHomeWork();
 
 //Teachable t = new Teachable(); 
 
}



}