package day62_june21;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionUncheckedException {

	public static void main(String[] args) {
		
		
		System.out.println("Beginning ");
		// throw 
		// We are required to handle checked exception at compile time 
		// or it will not even compile 
		try {
			
			System.out.println("DOING SOME IO INTENSIVE ACTIONS ");
			System.out.println("READING A FILE");
			
			
			// FileNotFoundException is Sub class of IOException 
			// so any catch block that have super type exception can catch this
			throw new FileNotFoundException();
			
			
			// throw new IOException();
			
			// throw new Exception();
			// Exception is super type of IOException and can not be caught in this catch block 
			
			
		} catch (IOException e) {
			// IOException e =  new Exception();
			// TODO Auto-generated catch block
			System.out.println("CAUGHT THE FIST !!! ");
			
		} 
		
		System.out.println("ENDING ");
		// We are not required to handle unchecked exception at compile time 
		// BUT If a exception object created , can not find any catch block 
		// that can contain this exception object , it will still throw the exception 
		// to the console 
		
		throw new RuntimeException() ; 
		// System.out.println(  10/2 );
		
		

	}

}
