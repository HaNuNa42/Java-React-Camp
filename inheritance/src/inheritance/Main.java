package inheritance;

public class Main {

	public static void main(String[] args) {

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.customerNumber = "12345";

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.customerNumber = "78910";

		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "1111110";

		CustomerManager customerManager = new CustomerManager();
		Customer[] customers = {individualCustomer, corporateCustomer, abc};
		customerManager.addMultible(customers);
		
		
		
		
		//customerManager.add(individualCustomer);
		//customerManager.add(corporateCustomer);
		//customerManager.add(abc);
	}

}
