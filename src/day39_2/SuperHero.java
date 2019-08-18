package day39_2;

import java.util.*;

public class SuperHero {
	public static void main(String[] args) {

		// we gonna write a program/game
		// in this game we have guess super hero name
		// we will have list of super heroes
		// out program will randomly pick hero
		// then our program will encrypt (it will replace every character in the name
		// with * (batman --> ******))hero name
		// our program will keep asking user
		// to enter super hero name
		// until user enters correct name
		// we created empty list of super heroes
		ArrayList<String> superheroes = new ArrayList<>();
		// we gonna add (load) super heroes to our collection
		
		superheroes.add("Superman");
		superheroes.add("Batman");
		superheroes.add("Wonder Woman");
		superheroes.add("Flash");
		superheroes.add("Aquaman");
		superheroes.add("Aladdin");
		superheroes.add("Cyborg");
		superheroes.add("Captain America");
		superheroes.add("Sadir Palwan");

		
		// we need to use do while loop to ask question until condition is true
		//we want to ask at least one, thats why we need to do with do while loop
		
		
		String randomHero="";
		Random random= new Random ();//to pick one from hero list randomly
		Scanner scan= new Scanner (System.in);
		String inputFromUser="";
		
		do {
			//if superhero name was not set, select random name from the collection 
			if (randomHero.isEmpty()) {
				randomHero = superheroes.get(random.nextInt(superheroes.size() - 1));
			}
			System.out.print("Guess superhero name: ");
			System.out.println(encryptName(randomHero));
			System.out.print("Enter the name: ");
			inputFromUser = scan.nextLine();
			if (!randomHero.equals(inputFromUser)) {
				System.out.println("Try again!");
			}
		}while(!randomHero.contentEquals(inputFromUser));
		System.out.println("you win ");
		System.out.println("WEll Done!");
		System.out.println("SuperHero name: "+ randomHero);
	}

	public static String encryptName(String name) {

		String encrytedName= "";
		for (int i= 0; i < name.length() ;i++) {    //ismin uzunlugu kadar yildiz ekler
			encrytedName+="*";
		}
		return encrytedName+ " : "+ encrytedName.length()+" letters  ";
	}
}