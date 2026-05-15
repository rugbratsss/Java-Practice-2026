import java.util.Scanner;
public class PoliticianDriver{
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter surname: ");
		String surname = kb.nextLine();
		System.out.print("Enter position: ");
		String position = kb.nextLine();
		System.out.print("Enter political party: ");
		String politicalParty = kb.nextLine();
		
		System.out.print("Enter budget: ");
		int budget = kb.nextInt();
		System.out.print("Enter money spent: ");
		double moneySpent = kb.nextDouble();
		
		Politician p1 = new Politician(surname, position, politicalParty);
		
		System.out.println("\n=====Details=====");
		System.out.println("Surname: " + p1.getSurname());
		System.out.println("Position: " + p1.getPosition());
		System.out.println("Political party: " + p1.getPoliticalParty());
		
		System.out.println("\n=====Verdict=====");
		if(p1.goodPolitician(budget,moneySpent)){
			System.out.println(p1.getSurname() + " is a good politician");
		}else{
			System.out.println(p1.getSurname() + " is not a good politician");
		}
		
		kb.close();
	}
}
