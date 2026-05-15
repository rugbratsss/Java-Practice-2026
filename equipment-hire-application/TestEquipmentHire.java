import java.util.Scanner;
public class TestEquipmentHire{
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		
		System.out.println("How many rentals to process (max 5)? ");
		int numRentals = kb.nextInt();
		kb.nextLine();
		
		for(int i = 0; i < numRentals; i++){
			System.out.println("Enter details for rental " + (i+1) + ": ");
			System.out.print("Name: ");
			String customerName = kb.nextLine();
			
			System.out.print("Type (Submersible/Centrifugal/Petrol): ");
			String equipmentType = kb.nextLine();
			
			System.out.print("Daily Rate: ");
			double dailyRate = kb.nextDouble();
			
			System.out.print("Rental Days: ");
			int rentalDays = kb.nextInt();
			kb.nextLine();
			
			EquipmentHire e1 = new EquipmentHire(customerName,equipmentType,dailyRate,rentalDays);
			
			System.out.println("---Rental Summary---");
			System.out.println("Customer\tType\t\tDays\tRate/Day\tTotal Amount");
			System.out.println(e1.getCustomerName() + "\t" + e1.getEquipmentType() + "\t\t" + e1.getRentalDays() + "\t" + e1.getDailyRate() + "\t" + e1.calculateTotalAmount());
		}
	}
}
