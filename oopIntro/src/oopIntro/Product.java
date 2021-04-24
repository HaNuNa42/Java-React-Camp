package oopIntro;

public class Product {
	
	public Product() { //constructor
		System.out.println("ben çalýþtým");
	}
	
	public Product(int id, String name, double unitPrice, String detail) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		//this(); //iki constructoru birbirine eþitlemek için kullanabiliriz.
		
		System.out.println("burasý çalýþtý");
		
		
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;

}
