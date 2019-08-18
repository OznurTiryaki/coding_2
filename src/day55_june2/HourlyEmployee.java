package day55_june2;

public class HourlyEmployee extends Employee{
    
	
	private int MonthlyHourlyWork;
	private int hourlyRate;
	
	
	public HourlyEmployee(int id, String name, int monthlyHourlyWork, int hourlyRate) {
		super(id,name);
		this.MonthlyHourlyWork = monthlyHourlyWork;
		this.hourlyRate = hourlyRate;
	}
	
	public int getMonthlyHourlyWork() {
		return MonthlyHourlyWork;
	}
	public void setMonthlyHourlyWork(int monthlyHourlyWork) {
		MonthlyHourlyWork = monthlyHourlyWork;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
//	public void calculateAnualSalary() {
//		
//	}

	@Override
	public void calculateAnnualSalary() {
		// bunu override yapmazsak sinifimiz hata veriyor. abstract methodu provide etmek zorundayiz, cunku 
		//non abstract classta da olsak onu extend ediyoruz.
		int annual= MonthlyHourlyWork* hourlyRate *12;  //12 for year
		System.out.println(annual);
	}

	
	@Override
	public String toString() {
		return "HourlyEmployee [MonthlyHourlyWork=" + MonthlyHourlyWork + ", hourlyRate=" + hourlyRate
				+ ", getMonthlyHourlyWork()=" + getMonthlyHourlyWork() + ", getHourlyRate()=" + getHourlyRate()
				+ ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
}
