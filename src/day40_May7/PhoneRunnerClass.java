package day40_May7;

public class PhoneRunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone p = new Phone();

		p.type = "Pphone";
		p.OS = "IOS";
		p.capasity = 32;

		p.all();
		p.ring();
        p.dial (5122990501L);
        
		Phone p1 = new Phone();
		p1.type = "Samsung";
		p1.OS = "android";
		p1.capasity = 16;
		p1.all();
		p1.ring();
		p1.dial (5122990501L);
	       

		Phone p2 = new Phone();
		p2.type = "Pixel";
		p2.OS = "android ";
		p2.capasity = 64;
		p2.all();
		p2.ring();
		p2.dial (5122990501L);
	       

	}

}
