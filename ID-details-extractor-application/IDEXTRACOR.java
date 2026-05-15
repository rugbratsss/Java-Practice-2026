import java.util.*;
public class idExtractor{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        String ID;
        do{
            System.out.print("Enter your ID (x to exit): ");
            ID = kb.nextLine();
            if(ID.equalsIgnoreCase("x"))
                break;
            if(ID.length() < 13){
                System.out.println("Invalid ID, Must be atleast 13 digits!");
                continue;
            }
            String yy = ID.substring(0,2);
            String mm = ID.substring(2,4);
            String dd = ID.substring(4,6);
            String gDigits = ID.substring(6,10);
            int yyInt = Integer.parseInt(yy);
            int year = (yyInt <= 24) ? 2000 + yyInt : 1900 + yyInt;
            int day = Integer.parseInt(dd);
            int month = Integer.parseInt(mm);
            int gGender = Integer.parseInt(gDigits);
            String gender = (gGender >= 5000) ? "Male" : "Female";
            System.out.println("Gender: " + gender);
            System.out.println("Year: " + year);
            System.out.println("Month: " + months[month - 1]);
            System.out.println("Day: " + day);
        }
        while(true);
    }
}
