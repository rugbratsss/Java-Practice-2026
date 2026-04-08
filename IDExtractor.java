import java.util.Scanner;
public class IDExtractor{

    public static String getMonthName(int month){
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        return months [month - 1];
    }


    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        do{
            System.out.print("Enter ID (z to exit) : ");
            String ID = kb.nextLine();

            if(ID.equalsIgnoreCase("z"))
                break;

            String yy = ID.substring(0, 2);
            String mm = ID.substring(2, 4);
            String dd = ID.substring(4, 6);

            int yyInt = Integer.parseInt(yy);
            int year = (yyInt <= 24) ? 2000 + yyInt : 1900 + yyInt;
            
            int month = Integer.parseInt(mm);
            int day = Integer.parseInt(dd);

            System.out.println("Year : " + year);
            System.out.println("Month : " + getMonthName(month));
            System.out.println("Day : " + day);

            System.out.print("Continue? (y/n): ");

        }
        while(kb.nextLine().equalsIgnoreCase("y"));
    }

}