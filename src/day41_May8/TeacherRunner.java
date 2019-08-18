package day41_May8;

public class TeacherRunner {

	public static void main(String[] args) {
		

		Teacher akbar = new Teacher ();
		
	
		
		akbar.setName("Akbar");
		akbar.setSpecialty ("Magic");
		
		System.out.println(akbar.getName());
		System.out.println(akbar.getSpecialty());
		
		akbar.setName("Magic Man Sparten");
		akbar.setSpecialty ("Release Magic Horse");
		
		System.out.println(akbar.getName());
		System.out.println(akbar.getSpecialty());
		
	}

}
