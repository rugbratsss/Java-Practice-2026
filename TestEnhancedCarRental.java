import java.util.Scanner;
public class TestEnhancedCarRental{
	public static void main(String[] args){
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("How many customers max 5: ");
		int numCustomers = kb.nextInt();
		
		for(int i = 0; i < numCustomers; i++){
			System.out.println("Enter details for customer " + (i+1) + ": ");
			System.out.print("Enter name: ");
			String customerName = kb.nextLine();
			
			System.out.print("Car group (Hatch, Sedan, SUV, Van): ");
			String carGroup = kb.nextLine();
			
			System.out.print("Rate per day: ");
			double ratePerDay = kb.nextDouble();
			
			System.out.print("Rental days: ");
			int rentalDays = kb.nextInt();
			
			EnhancedCarRental e1 = new EnhancedCarRental(customerName,carGroup,ratePerDay,rentalDays);
			
			System.out.println("---- Rental Summary ----");
			System.out.println("Customer name: " + e1.getCustomerName());
			System.out.println("Car group: " + e1.getCarGroup());
			System.out.println("Rate per day: " + e1.getRatePerDay());
			System.out.println("Rental days: " + e1.getRentalDays());
			System.out.println("Discount: " + e1.calculateDiscount());
			System.out.println("Total Pay: " + e1.calculateTotalCost());
			
		}
		
	}
}
