package day55_june2;

public class SalariedEmployee extends Employee{

	private int monthlySalary;

	public int getMonthlySalary() {
		return monthlySalary;
	}
	

	public SalariedEmployee(int id, String name, int monthlySalary) {
		super(id, name);
		this.monthlySalary = monthlySalary;
	}


	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

//    public void calculateAnnualSalary() {
//		
//	}
	 
	@Override
	public void calculateAnnualSalary() {
		// bunu override yapmazsak sinifimiz hata veriyor. abstract methodu provide etmek zorundayiz, cunku 
		//non abstract classta da olsak onu extend ediyoruz.
		int annual= monthlySalary *12;  //12 for year
		System.out.println(annual);
	}


	@Override
	public String toString() {
		return "SalariedEmployee [monthlySalary=" + monthlySalary + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getClass()=" + getClass() + "]";
	}
	
	public static void main(String[] args) {
		
		SalariedEmployee e1= new SalariedEmployee(101, "Bilal", 10000) ;
		
		e1.calculateAnnualSalary();
		e1.setMonthlySalary(125000);
		e1.calculateAnnualSalary();
		
		HourlyEmployee e2= new HourlyEmployee (102, "Ahmat", 160,80);
		e2.calculateAnnualSalary();
		
	}
	
}
