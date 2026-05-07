import java.util.Scanner;
import java.util.Random;
    
    
public class coronaStats{
    public static double searchR(String userProvince , String[] province, int[] infections, int[] recoveries)
    {
        for(int i = 0; i < province.length; i++)
        {
            if(province[i].equalsIgnoreCase(userProvince))
            {
                return((double) revories[i] / infections[i] * 100);
            }
        }
        return -1;
    }
}
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        String[] province = {"Limpopo", "Mpumalanga", "Gauteng", "North West", "Northern Cape", "Free State", "KwaZulu-Natal", "Western Cape", "Eastern Cape"};
        int[] infections = {8562,6687,16589,3874,1005,8333,15578,16368,13698};
        int[] recoveries = {8000,6300,14500,3200,850,7956,14975,15974,12879};
        
        System.out.print("Enter a province name: ");
    String userProvince = kb.nextLine();
    
    double results = searchR(userProvince,province,infections,recoveries);
    
    if(results != -1){
        System.out.print("Found!");
    }else{
        System.out.print("Not Found!");
    }
    }
}
