package interfaces;

public class Main {

	public static void main(String[] args) {

		Logger[] loggers = { new SmsLogger(), new EmailLogger(), new FileLogger() };
		
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer KadriyeNur = new Customer(1, "Hatice", "nur");
		customerManager.add(KadriyeNur);
	}

}
