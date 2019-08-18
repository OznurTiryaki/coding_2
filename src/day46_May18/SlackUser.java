package day46_May18;

public class SlackUser {

	private String name;
	private String email;
	private int groupNum;
	String channel;
	String content;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getGroupNum() {
		return groupNum;
	}
	public void setGroupNum(int groupNum) {
		this.groupNum = groupNum;
	}
	public SlackUser() {
		this("spartan","spartan.gmail.com",35); //we do chaining, we call 3 parameters constructor
		
	}
	public SlackUser(String name, String email, int groupNum) {
		
		this.name = name;
		this.email = email;
		this.groupNum = groupNum;
	}
	
	public String toString() {
		return "SlackUser [name=" + name + ", email=" + email + ", groupNum=" + groupNum + "]";
	} 
	
	public void sendMessage (String channel, String content) {
	
        System.out.println("User <" + this.name+ " >");
		System.out.println("Sent <" +content + " > to channel <" +channel);
	
}
	
}

