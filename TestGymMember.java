import java.util.Scanner;
public class TestGymMember{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter member name: ");
		String memberName = kb.nextLine();
		
		System.out.print("Enter member type (Basic/Premium/VIP): ");
		String membershipType = kb.nextLine();
		
		System.out.print("Enter number of months joined: ");
		int monthsJoined = kb.nextInt();
		
		System.out.print("Enter monthly rate (R) R:");
		double monthlyRate = kb.nextDouble();
		
		GymMember g1 = new GymMember(memberName, membershipType, monthsJoined, monthlyRate);
		
		System.out.println("====\tGymMember Details====");
		
		System.out.println("Member Name: " + g1.getMemberName());
		System.out.println("Membership Type: " + g1.getMembershipType());
		System.out.println("Months joined: " + g1.getMonthsJoined());
		System.out.printf("Monthly Rate: R%.2f%n" , g1.getMonthlyRate());
		System.out.printf("Total Fee (10%% discount applied): R%.2f%n" , g1.calculateTotalFee());
	}
}
