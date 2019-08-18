package day23_April6;

import java.util.Scanner;

public class DefualtValueForArrayObjectElements {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int []nums=new int[3];
		nums[1]=100;
		
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		
		boolean []bln=new boolean[3];//false was printed
		System.out.println(bln[0]);
		
		char []ch=new char[3];
		System.out.println(ch[0]);//nothing was printed
		
		byte []bt=new byte[3];
		System.out.println(bt[0]);//0(zero) was printed
		
		short []sh=new short[3];
		System.out.println(sh[0]);//0(zero) was printed
		
		int []i=new int[3];
		System.out.println(i[0]);//0(zero) was printed
		
		long []lg=new long[3];
		System.out.println(lg[0]);//0(zero) was printed
		
		float []flt=new float[3];
		System.out.println(flt[0]);//0.00(zero) was printed
		
		double []dbl=new double[3];
		System.out.println(dbl[0]);//0.00(zero) was printed
		
		//any reference type array will get null as default if no value was assigned 
		
		String[]str=new String[3];
		System.out.println(str[0]);//null was printed
		
		Scanner[]scan=new Scanner[3];
		System.out.println(scan[0]);//null was printed
		
	}

}
	