package day5;

public class Vtask4 {

	public static void main(String[] args) {
	

		//INCREMENT AND DECREMENT
		
				int i = 10;
				
				//i = i + 1; Sysout--11
				//i += 1;   Sysout--11
				//i++;       Sysout--11
				//i++; ++i;
				
		System.out.println(i); //i degeri 10
		
		System.out.println(i++); /*i degeri 1 artti fakat artilar sonra olunca sonuc bir sonraki isleme kaydi
		                           bu yuzden i hala 10  */
		System.out.println(i); //i degeri bir onceki islemden dolayi bir artti 11
				
		System.out.println(++i); //artilar basta oldugu icin i degeri hemen artti 12 oldu
		
        System.out.println(i); //i degeri 12
		
		System.out.println(i--); /*i degeri 1 azaldi fakat eksiler sonda olunca sonuc bir sonraki isleme kaydi
		                           bu yuzden i hala 12  */
		System.out.println(i); //i degeri bir onceki islemden dolayi bir azaldi 11
				
		System.out.println(--i); //eksiler basta oldugu icin i degeri hemen azaldi 9 oldu
		
		

	}

}
