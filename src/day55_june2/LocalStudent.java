package day55_june2;

public class LocalStudent extends Student{

	int seatId;
	
	
	
	
	public LocalStudent(int id, String name, int seatId) {
		super(id, name);
		this.seatId = seatId;
	}


	@Override
	public  void attendClass() {
		System.out.println("attend class in classroom");
}
}
