import java.util.*;
public class IDextractor2 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};

        do{
            System.out.print("Enter ID (z to exit): ");
            String ID = kb.nextLine();

            if(ID.equalsIgnoreCase("z"))
                break;

            if(ID.length() < 13){
                System.out.print("Invalid ID, Must be 13 Digits");

            }

            String yy = ID.substring(0, 2);
            String mm = ID.substring(2, 4);
            String dd = ID.substring(4, 6);
            String genderDigits = ID.substring(6,10);

            int yyInt = Integer.parseInt(yy);
            int year = (yyInt <= 24) ? 2000 + yyInt : 1900 + yyInt;
            int month = Integer.parseInt(mm);
            int day = Integer.parseInt(dd);
            int gDigits = Integer.parseInt(genderDigits);

            String gender = (gDigits >= 5000) ? "Male" : "Female";

            System.out.println("Year: " + year);
            System.out.println("Month: " + months[month - 1]);
            System.out.println("Day: " + day);
            System.out.println("gender: " + gender);

        }
        while(kb.nextLine().equalsIgnoreCase("y"));
    }
}
