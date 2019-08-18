package day46_May18;

import java.util.ArrayList;

public class SlackRunner {

	public static void main(String[] args) {
//		optionally , 
//		create a ArrayList of SlackUser add all the objetcs 
//		loop through each item and print out 
//		and call sendMessage on each of them 
		
		SlackUser s1= new SlackUser();
		SlackUser s2= new SlackUser("No Name", "noname.gmail.com", 34);
		SlackUser s3 = new SlackUser ("student", "student@cybertek.com", 29);
		SlackUser s4 = new SlackUser ("mentor", "mentor@cybertek.com", 20);
		
		ArrayList <SlackUser> mylist= new ArrayList <> ();
		mylist.add(s1);
		mylist.add(s2);
		mylist.add(s3);
		mylist.add(s4);
		
		
		System.out.println(s1);
		System.out.println(s2);
		
		for(SlackUser each : mylist) {
			System.out.println(each);
			
		}
		
		s1.sendMessage("Classchat", "Good Morning everyone!");
		s2.sendMessage("repl", "My code works in eclipse but not in repl");
	}

}
