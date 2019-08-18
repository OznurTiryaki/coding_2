package day51_May26;

public class AnimalTalentShow {

	public static void main(String[] args) {

		Animal a = new Animal();
		Dog d = new Dog();
		Horse h = new Horse();   

		a.makeNoise();
		
		d.makeNoise();
		h.makeNoise();   //now when we print horse, we get animal noise too
		                 //because we call make noise method from animal class with super
		                 //super.makeNoise(); --->we call this in horse class's method inside
		
	/*	public void makeNoise () {
			
			super.makeNoise(); //superi koymazsak tanimaz kendisi zanneder.once super class a gitti
			sonra da horse'unkini yazdirdi
			
			====> animal make ... noise
                  Horse make NAI NAI NAI noise

			System.out.println("Horse make NAI NAI NAI noise" );   */
	}

}
