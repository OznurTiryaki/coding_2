package day34_April27;

public class VarArgs4TakeMoreParameter {

	public static void main(String[] args) {
		 
	    /// varArgs --is represented in method parameter using ...
	    /*
	     *  ... CAN ONLY BE USED AS METHOD PARAMTERS 
	     *  IT CAN NOT BE USED ANYWHERE ELSE ---just for method
	     *  
	     *  Calling a method that have varArg 
	     *   we directly pass variable number of arguments 
	     *   You may also pass an array --(not so common but possible)
	     *   
	     *   What if we have more than one parameter in methods 
	     *   
	     *    * If there is multiple parameters VarArgs should be last one 
	  
	     *   Multiple varargs in one method paramters are not allowed 
	     *   you can have at most one varArg in one method 
	     *   
	     *   
	     *   a method that takes varArg as parameter can accept a array object 
	     *   as an argument 
	     *    
	     *   a method that takes array as parameter can not accept a varArg
	     *   as an argument 
	     *   
	     * */
	    doSomething("magic horse", 1,2,3,4,45,5,6,7,8,8,9,9);
	    
//	    doSomethingElse(1,2,4,5,"Magic Horse"); 
//	    doSomethingElse(5,"Magic Horse");
	    
	  }
	  
	  public static void doSomething(String name, int... nums) {  //once other parameter i kullanmamiz lazim
	    System.out.println("do something was called");
	  }
	  
	  
	  /*
	   * If there is multiple parameters, VarArgs should be last one 
	   * */
	//  public static void doSomethingElse(int... nums , String name) {
//	    System.out.println("do SomethingElse was called");
	//  }
	  
	  
	  

	}