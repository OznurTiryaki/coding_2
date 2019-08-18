package day56_june5;

//interface is a abstract type 
//just like abstract classes 


public interface Teachable {

// as of java 7 
// interface can only have CONSTANT and abstract method 

public static final boolean STUDY_HARD = true; 
// any field you have AUTOMATICALLY PUBLIC STATIC FINAL 
String SCHOOL = "CyberTek"; 

// any method without body or access modifier 
// it's automatically public and abstract

// very common interview | exam questions goes as : 
// not providing access modifier in interface 
// and overriding the method with default access modifier 
// DOES NOT COMPILE !!! 



public abstract void canLearn(); 



public abstract void doHomeWork(); 



}