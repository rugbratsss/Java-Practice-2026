import java.util.*;
public class IDEXTRACTORr {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        
        do{
            System.out.print("Enter ID (z to exit): ");
            String ID = kb.nextLine();

            if(ID.equalsIgnoreCase("z"))
                break;
            if(ID.length() < 13){
                System.out.println("Invalid ID, must be 13!");
            }

            String yy = ID.substring(0, 2);
            String mm = ID.substring(2, 4);
            String dd = ID.substring(4,6);
            String genderDigits = ID.substring(6, 10);

            int intYY = Integer.parseInt(yy);
            int year = (intYY <= 24 ) ? 2000 + intYY : 1900 + intYY;
            int month = Integer.parseInt(mm);
            int day = Integer.parseInt(dd);
            int gGender = Integer.parseInt(genderDigits);

            String gender = (gGender >= 5000) ? "Male" : "Female";

            System.out.println("Month: " + months[month - 1]);
            System.out.println("Year: " + year);
            System.out.println("Day: " + day);
            System.out.println("Gender: " + gender);

        }
        while(kb.nextLine().equalsIgnoreCase("y"));
    }
}
