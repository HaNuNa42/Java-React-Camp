package oopIntro;

public class Product {
	
	public Product() { //constructor
		System.out.println("ben �al��t�m");
	}
	
	public Product(int id, String name, double unitPrice, String detail) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		//this(); //iki constructoru birbirine e�itlemek i�in kullanabiliriz.
		
		System.out.println("buras� �al��t�");
		
		
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;

}
