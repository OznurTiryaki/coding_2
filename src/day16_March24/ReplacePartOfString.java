package day16_March24;

public class ReplacePartOfString {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//you can take entire or just one character
		
		String str = "Date is 03_25_2019";
		
		str = str.replace("_", "-");
		
		System.out.println(str);
		
		str = str.replace("is", "will be");
		
		System.out.println(str);
		
		
		String str2 = "AAAAABBBBBCCCCC";   //tumunu degistirir tek harf girersek
		
		System.out.println(str2.replace("A", "Z"));
		
		//yaziyi silmek icin
		
		System.out.println(str = str.replace("Date will be ", ""));
	}

}
