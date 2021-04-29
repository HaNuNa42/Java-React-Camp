package inheritance;

public class CustomerManager {

	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " kaydedildi.");
	}

	//bulk insert
	public void addMultible(Customer[] customers) {
		for(Customer customer : customers) {
			add(customer);
		}
	}
}
