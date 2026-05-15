import java.util.Scanner;
import java.util.Random;
public class StreamingService {
    public static void displayStreamingServices(String[] serviceProviders, String[] originCountry, int[] subscribers, int[] userRatings)
    {
        System.out.println("=================================================================");
        System.out.println("Service Providers\t\tCountry\t\tSubscribers\tUser Ratings");

        for(int i = 0; i < userRatings.length; i++){
            System.out.println(serviceProviders[i] + "\t\t\t\t" + originCountry[i] + "\t\t" + subscribers[i] + "\t\t" + userRatings[i]);
        }
    }
    public static void sortServiceProvider (String[] serviceProviders, String[] originCountry, int[] subscribers, int[] userRatings)
    {
        for(int i = 0; i < serviceProviders.length - 1; i++){
            for(int j = 0; j < serviceProviders.length - i - 1; j++){
                if(serviceProviders[j].compareTo(serviceProviders[j + 1]) > 0){

                    String tempService = serviceProviders[j];
                    serviceProviders[j] = serviceProviders[j + 1];
                    serviceProviders[j + 1] = tempService;

                    String tempCountry = originCountry[j];
                    originCountry[j] = originCountry[j + 1];
                    originCountry[j + 1] = tempCountry;

                    int tempSubs = subscribers[j];
                    subscribers[j] = subscribers[j + 1];
                    subscribers[j + 1] = tempSubs;

                    int tempRate = userRatings[j];
                    userRatings[j] = userRatings[j + 1];
                    userRatings[j + 1] = tempRate;
                }
            }
        }
    }
    public static int mostWatchedService (int[]subscribers)
    {
        int index = 0;
        int highestUsed = subscribers[0];
        for(int i = 0; i < subscribers.length; i++)
        {
            if(subscribers[i] > highestUsed)
            highestUsed = subscribers[i];
            index = i;
        }
        return index;
    }
    public static void populateRatings(int[] userRatings, String[] serviceProviders)
    {
        Scanner kb = new Scanner(System.in);
        for(int i = 0; i < userRatings.length; i++)
        {
            System.out.print("Enter user ratings(1-5) for " + serviceProviders[i] + " :");
            userRatings[i] = kb.nextInt();

            while(userRatings[i] < 1 || userRatings[i] > 5)
            {
                System.out.print("Invalid input, must be between 1 and 5, enter user rating for " + serviceProviders[i] + ": ");
                userRatings[i] = kb.nextInt();
            }
        }
    }
    public static void populateSubscribers(int[] subscribers)
    {
        Random rand = new Random();
        for(int i = 0; i < subscribers.length; i++)
        {
            subscribers[i] = rand.nextInt(400001) + 10000;
        }
    }
   
    public static void main(String[] args)
    {
        String[] serviceProviders = {"YouTube", "Netflix", "DSTV", "ShowMax", "PrimeTV", "SABC+"};
        String[] originCountry = {"USA", "USA", "RSA", "RSA", "USA", "RSA"};

        int[] subscribers = new int[originCountry.length];
        int[] userRatings = new int[originCountry.length];

        populateSubscribers(subscribers);
        populateRatings(userRatings,serviceProviders);

        int mostWatchedIndex = mostWatchedService (subscribers);
        System.out.println("Most watched service provider " + serviceProviders[mostWatchedIndex] + " " + subscribers[mostWatchedIndex] + " subscribers.");
        
        sortServiceProvider(serviceProviders,originCountry,subscribers,userRatings);
        displayStreamingServices(serviceProviders,originCountry,subscribers,userRatings);

        

    }
}
