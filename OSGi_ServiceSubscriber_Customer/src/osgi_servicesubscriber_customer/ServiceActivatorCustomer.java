package osgi_servicesubscriber_customer;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.mtit.service.ServicePublish_HotelMain;

public class ServiceActivatorCustomer implements BundleActivator {

	ServiceReference serviceReference;
	Scanner scan = new Scanner(System.in); //obtaining the input of the primitive types like int, double, etc. and strings
	
	public void start(BundleContext context) throws Exception { //access to other methods so that this bundle can interact with the Framework
		
System.out.println("Start Hotel customer service"); //Display the massage
		
		System.out.println("If you want to buy items, enter 'b'.\n"
				+ "If you want to pay a bill, enter 'p'.\n"
				+ "If you want to quit, enter 'q'.");
		String option = scan.next();
		
		//Using Break function for choosing options
		if (option.equals("b")) {
			buyItems();
		}
		else if (option.equals("p")) {
			payBill();
		}
		else if (option.equals("q")) {
			System.exit(0);
		}
		else {
			System.out.println("Invalid input.");
		}
		
		serviceReference = context.getServiceReference(ServicePublish_HotelMain.class.getName()); //Returns the name of the entity (class, interface, array class, primitive type, or void) represented by this Class object, as a String 
		ServicePublish_HotelMain servicePublish_HotelMain =(ServicePublish_HotelMain) context.getService(serviceReference);
		
		
		servicePublish_HotelMain.order(); //
		servicePublish_HotelMain.menu();
		
		
	
		
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Good bye customer!!!");
		context.ungetService(serviceReference);
	}
	
	
	public void buyItems() {
		int totalItems = 0;
		int totalPrice = 0;

		System.out.println("Do you want to continue? (Y/N): ");
		String quit = scan.next();
		
		while (quit.equals("y")) {
			System.out.println("Unit price: ");
			int price = scan.nextInt();
			System.out.println("Quantity: ");
			int qty = scan.nextInt();
			totalItems++; //Increment the totalItems increases the value of the variable by one
			
			totalPrice = totalPrice + (price * qty);

			System.out.println("Do you want to continue? (Y/N): ");
			quit = scan.next();
			
			if (quit.equals("n")) {
				System.out.println("\nTotal items: " + totalItems);
				System.out.println("Total price: " + totalPrice);
			}
			
		} 
	}

	public void payBill() {
		System.out.println("Enter bill code: ");
		int code = scan.nextInt();
		System.out.println("Bill amount: ");
		int amount = scan.nextInt();
		
		System.out.println("Successfully paid the bill " + code + " with " + amount + "LKR.");
	}

}
