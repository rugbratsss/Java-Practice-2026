import java.util.Scanner;
public class TestMedication{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter medication name: ");
		String medicationName = kb.nextLine();
		
		System.out.print("Enter dosage (mg): ");
		double dosageMg = kb.nextDouble();
		
		System.out.print("Enter stock units: ");
		int stockUnits = kb.nextInt();
		
		System.out.print("Enter price per unit (R): ");
		double pricePerUnit = kb.nextDouble();
		
		Medication m1 = new Medication(medicationName,dosageMg,stockUnits,pricePerUnit);
		
		System.out.println("Medication name: " + m1.getMedicationName());
		System.out.println("Dosage: " + m1.getDosageMg());
		System.out.println("Stock Units: " + m1.getStockUnits());
		System.out.println("Price Per Value: " + m1.getPricePerUnit());
		
		System.out.printf("Stock value: R%.2f%n" , m1.calculateStockValue());
	}
}
