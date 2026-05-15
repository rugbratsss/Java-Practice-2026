import java.util.Scanner;
import java.util.Random;
public class StreamingServiceApplication2{
    public static void displayStreamingServices(String[] serviceProviders, String[] originCountry, int[] subscribers, int[] userRatings)
    {
        System.out.println("========================================================================");
        System.out.println("Service Providers\t\tOrigin Country\t\tSubscriber\tUser Ratings");
        for(int i = 0; i < serviceProviders.length; i++)
        {
            System.out.println(serviceProviders[i] + "\t\t\t\t\t" + originCountry[i] + "\t\t\t\t\t" + subscribers[i] + "\t\t" + userRatings[i]);
        }
    }
public static int searchP(String[] serviceProviders, String searchProvider)
    {
        for(int i = 0; i < serviceProviders.length; i++)
        {
            if(serviceProviders[i].equalsIgnoreCase(searchProvider))
            {
                return i;
            }
        }
        return -1;
    }
public static void sortServiceProvider(String[] serviceProviders, String[] originCountry, int[] subscribers, int[] userRatings)
    {
        for(int i = 0; i < serviceProviders.length - 1; i++)
        {
            for(int x = 0; x < serviceProviders.length - i - 1; x++)
            {
                if(serviceProviders[x].compareTo(serviceProviders[x + 1])> 0)
                {
                    String tempService = serviceProviders[x];
                    serviceProviders[x] = serviceProviders[x + 1];
                    serviceProviders[x + 1] = tempService;
                    
                    String tempCountry = originCountry[x];
                    originCountry[x] = originCountry[x + 1];
                    originCountry[x + 1] = tempCountry;
                    
                    int tempSubs = subscribers[x];
                    subscribers[x] = subscribers[x + 1];
                    subscribers[x + 1] = tempSubs;
                    
                    int tempRate = userRatings[x];
                    userRatings[x] = userRatings[x + 1];
                    userRatings[x + 1] = tempRate;
                  
                }
            }
        }
    }
public static int mostWatchedService(int[] subscribers)
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
            System.out.print("Enter user ratings (1-5) for " + serviceProviders[i] + ": ");
            userRatings[i] = kb.nextInt();
            while(userRatings[i] < 1 || userRatings[i] > 5)
            {
                System.out.print("Invalid input, must be between 1 and 5, enter ratings for " + serviceProviders[i] + ": ");
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
        
        Scanner kb = new Scanner(System.in);
         
        String[] serviceProviders = {"YouTube", "Netflix", "ShowMax", "DSTV", "PrimeTV", "SABC+"};
        String[] originCountry = {"USA", "USA", "RSA", "RSA", "USA", "RSA"};
        
        int[] subscribers = new int[serviceProviders.length];
        int[] userRatings = new int[serviceProviders.length];
        
        populateSubscribers(subscribers);
        populateRatings(userRatings,serviceProviders);
        int mostWatched = mostWatchedService(subscribers);
        System.out.println("Most watched service provider is " + serviceProviders[mostWatched] + " with " + subscribers[mostWatched] + " subscribers.");
        
        sortServiceProvider(serviceProviders,originCountry,subscribers,userRatings);

        System.out.print("Enter to search a service provider: ");
        String searchProvider = kb.nextLine();
        
        int results = searchP(serviceProviders,searchProvider);
        
        if(results != -1){
            System.out.println(serviceProviders[results] + " was found!");
        }else{
            System.out.println(searchProvider + " was not found!");
        }
        
        displayStreamingServices(serviceProviders,originCountry,subscribers,userRatings);
    }
}
