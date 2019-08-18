package day51_May26;

public class BankRunner {

	public static void main(String[] args) {
		

		SavingAccount s1= new SavingAccount("Oznur", 12345,10000,2.3);
		
		System.out.println(s1);
		s1.add(100); // 100 eklendi cunku saving hesabindaki methodu kullaniyoruz
		s1.add(1000);  // 100 de burada eklendi  10200.0 oldu
		
		System.out.println("current amout is "+s1.balance); //with draw olunca -10 oldu
		//ve sonuc 10190.0
		s1.withdraw(10000);
		System.out.println("current amout is "+s1.balance);
		
		BankAccount b1= new BankAccount("Oznur", 12345,10000);
		b1.add(100);  //bank account taki methodu kullandigi icin
		//verilen para kadar ekledi   ---> 10100.0
		System.out.println("current amout is "+ b1.balance);
		b1.withdraw(10000);   //---->  100.0
		//verilen number kadar azaltti
		System.out.println("current amout is "+ b1.balance);
		System.out.println(b1);
	}

}
