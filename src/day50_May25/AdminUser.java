package day50_May25;

public class AdminUser extends SlackUser {

	//	String name;
//	String status;
//	int timeZone;
	
	int adminLevel;
	

	public AdminUser(String name, String status, int timeZone,int adminLevel) {
		super(name, status, timeZone);
		this.adminLevel=adminLevel;
	}

  /*   @override 
	optional annotation to make sure
	you are overriding it correctly
	not mandatory but encourage
	

*/
	
	
}
