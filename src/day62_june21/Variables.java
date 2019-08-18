package day62_june21;

import java.util.ArrayList;


	
public class Variables{

String tickerSymbol;
String companyName;
int price;
double percentChange;
int totalShares;
long marketCap;



public Variables(String tickerSymbol, String companyName, int price, int totalShares) {
	super();
	this.tickerSymbol = tickerSymbol;
	this.companyName = companyName;
	this.price = price;
	this.totalShares = totalShares;
	this.marketCap= totalShares*price;
}
   public void adjustPrice(int value) {
	  
	   this.percentChange = 1.0*value/price;
		this.price +=  value;
		this.marketCap = this.totalShares*this.price;
	   
   }
@Override
public String toString() {
	return "Variables [Ticker Symbol: " + tickerSymbol + "\n" + "Company: " + companyName + "\n"  +  "Current Price:" + price
			+ "Market Cap: " + marketCap + "]";
}




}