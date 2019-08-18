package day60_june12;

public class SmartTv extends TV{

//    int channelCount =100;
	  
	int channelCount =200;    //hiding
	@Override
	public void play() {
		System.out.println("Playing smart");
	}
	
	public static void doTVStatic() {
		System.out.println("do smartTV Static ");
	}

//	@Override
//	public int getChannleCount() {
//		return channelCount;
//	}
//    
    //we dont have to override all method but, we know we already have exactly same method or varibale in class
    //just we dont see it. channelCount()' u yazmadigimizda burada olmasina ragmen biz onu cagirmadigimiz icin
    //o hala bize super class version'i verdi!!!!!!!
    
    public static void main(String[] args) {
		
		
    	TV tv=new SmartTv();
    	
    	
    	/*System.out.println(tv1.channelCount()); //(When we override the method in sub class
    	 *
    	-->200 it override at run time no mather the type)
    	*/
    	System.out.println(tv.getchannelCount()); //100
    	
    	/*//we dont have to override all method but, we know we already have exactly same method or varibale in class
  just we dont see it. channelCount()' u yazmadigimizda burada olmasina ragmen biz onu cagirmadigimiz icin
 /o hala bize super class version'i verdi!!!!!!!

    	 * 
    	 */
    	
    	System.out.println(tv.channelCount);  //burada TV super class ile cagirinca bize TV deki degeri verdi
    	//only reference type decided what we can access
    	//so access type decided it and it print that(variables are not overridden)
    	
    	tv.play();  //// new SmartTV().play() //(we can overrride the methods and an at run time evet though the referance type,
    	//it goes the correct version of override --->   Playing SMART TV
    	
    	
    	
    	//if we have a static method, no matter what's the object, , only reference type decide what's accessible
	}
}
