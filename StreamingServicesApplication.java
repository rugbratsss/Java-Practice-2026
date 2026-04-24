import java.util.Scanner;
import java.util.Random;
public class StreamingServicesApplication {
    public static void displayStreamingServices(String[] serviceProviders, String[] originCountry, int[] subscribers, int[] userRatings)
    {
        System.out.println("=========================================================================");
        System.out.println("Service Providers\tCountry\t\tSubscribers\tUser Ratings");
        for(int i = 0; i < serviceProviders.length; i++)
        {    
            System.out.println(serviceProviders[i] + "\t\t\t" + originCountry[i] + "\t" + subscribers[i] + "\t\t" + userRatings[i]);
        }
    }
    public static void sortServiceProvider (String[] serviceProviders, String[] originCountry, int[] subscribers, int[] userRatings)
    {
        for(int i = 0; i < serviceProviders.length - 1; i++)
        {
            for(int a = 0; a < serviceProviders.length - i - 1; a++)
            {
                if(serviceProviders[a].compareTo(serviceProviders[a + 1]) > 0)
                {
                    String tempService = serviceProviders[a];
                    serviceProviders[a] = serviceProviders[a + 1];
                    serviceProviders[a + 1] = tempService;

                    String tempCountry = originCountry[a];
                    originCountry[a] = originCountry[a + 1];
                    originCountry[a +1] = tempCountry;

                    int tempSubs = subscribers[a];
                    subscribers[a] = subscribers[a + 1];
                    subscribers[a + 1] = tempSubs;

                    int tempRatings = userRatings[a];
                    userRatings[a] = userRatings[a + 1];
                    userRatings[a + 1] = tempRatings;
                }
            }
        }
    }
    public static int mostWatchedService (int[] subscribers)
    {   
        int index = 0;
        int highestUsed = subscribers[0];

        for(int i = 0; i < subscribers.length; i++)
        {
            if(subscribers[i] > highestUsed)
            {
                highestUsed = subscribers[i];
                index = i;
            }
        }
        return index;
    }

    public static void populateRatings(int[] userRatings, String[] serviceProviders)
    {
        Scanner kb = new Scanner(System.in);
        for(int i = 0; i < userRatings.length; i++)
        {
                System.out.print("Enter user ratings(1-5) for " + serviceProviders[i] + ": ");
                userRatings[i] = kb.nextInt();
                while(userRatings[i] < 1 || userRatings[i] > 5)
                {
                    System.out.print("Invalid input, enter a number from 1 to 5 for " + serviceProviders[i] + ": ");
                    userRatings[i] = kb.nextInt();
                }
              
        }
    }
    public static void populateSubscribers(int[] subscribers)
    {
        Random rand = new Random();

        for(int i = 0; i < subscribers.length; i++)
        {
            subscribers[i] = rand.nextInt(400001) + 100000;
        }
    }
    public static void main(String[] args)
    {
        String[] serviceProviders = {"YouTube", "Netflix","DSTV", "ShowMax", "PrimeTV", "SABC"};
        String[] originCountry = {"United States", "United States", "South Africa", "South Africa", "United States", "South Africa"}; 

        int[] subscribers = new int [serviceProviders.length];
        int[] userRatings = new int [serviceProviders.length];

        populateSubscribers(subscribers);
        populateRatings(userRatings,serviceProviders);

        int mostWatched = mostWatchedService (subscribers);
        System.out.println("Most watched service providers " + serviceProviders[mostWatched] + " " + subscribers[mostWatched] + " subscribers");

        sortServiceProvider(serviceProviders,originCountry,subscribers,userRatings);
        displayStreamingServices(serviceProviders,originCountry,subscribers,userRatings);
    }
}
