package day58_june9;

public class Horse extends Animal{
	
//	
//	public void makeNoise () {
//		System.out.println("General Noise");
//	}  it is inherit that, but we wanted to customize it. And we do  
	
	@Override
	public void makeNoise () {
		System.out.println("NEIGH NEIGH");
	}
	
}
