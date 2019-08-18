package day6;

public class Task1 {

	public static void main(String[] args) {

		// Warm Up

		// declare a variable OfferCount and give initial value of 1 ;

		int offerCount = 1;

		// lets imagine you got five offer today--shorthand assignment

		offerCount += 5;

		System.out.println(offerCount);

		// you have rejected two of them

		offerCount -= 2;

		System.out.println(offerCount);

		// then after a week, your offer multiplied by 4

		offerCount *= 4;

		System.out.println(offerCount);

		// then you decided cut the offer count to half of what you have

		offerCount /= 2;

		System.out.println(offerCount);

		// eventually you want to get remainder by 5;

		offerCount %= 5;

		System.out.println(offerCount);

	}

}
