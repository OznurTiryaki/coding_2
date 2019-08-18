package day53_May29;

public class OnlineCourse extends Course{

	//int capacity=150; this come from super class
	
	int capacity=300;   //it makes a hiding here. it always check same class/closest one 
	                    //after that if we have same field, it don't inherit same field from super class
	
	public void showCapacity() {
		
		System.out.println(this.capacity); //always go closest one, if don't say which class
		//with this we say go this class' capacity
		
		//or
		
		System.out.println(super.capacity); //we said go super classses field
		
	}
	public static void main(String[] args) {
		
		
		Course java = new Course ();
		
		System.out.println(java.capacity); //150
		
		
		OnlineCourse sdet=  new OnlineCourse();
		
		System.out.println(sdet.capacity); //300  when you do hoover over, you can see where it come from
		
		sdet.showCapacity();   //bunu cagardigimizda icinde ilk this ile sonra super ile methodu cagirdigimiz icin
		//once 300 u yani bu siniftakini sonra 150 yi yani super classtakini yazdirdi
		
		
	}

	
	
}
