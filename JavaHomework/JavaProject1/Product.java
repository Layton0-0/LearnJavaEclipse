package javaProject1;

public class Product {
	String prdNo;
	String prdName;
	int prdPrice;
	int prdYear;
	String prdMaker;
	
	public Product(String prdNo, String prdName, int prdPrice, int prdYear, String prdMaker) {
		this.prdNo = prdNo;
		this.prdName = prdName;
		this.prdPrice = prdPrice;
		this.prdYear = prdYear;
		this.prdMaker = prdMaker;
	}
	
	@Override
	public String toString() {
		String excel = prdNo + "\t" + prdName + "\t" + 
				Integer.toString(prdPrice) +"\t" +  Integer.toString(prdYear) +"\t" +  prdMaker;
		
		return excel;
	}
}
