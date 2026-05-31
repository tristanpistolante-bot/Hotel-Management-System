package hotel_management_systemprj;

import java.util.ArrayList;

public class HotelData 
{
    private static ArrayList<Guest> guests = new ArrayList<>();
    private static Guest loggedInGuest = null;
    private static Booking currentBooking = null;
    private static Room currentRoom = null;


    public static boolean registerGuest(Guest guest) 
    {
        for (Guest g : guests) 
        {
            if (g.getUsername().equalsIgnoreCase(guest.getUsername())) 
            {
                return false; 
            }
        }
        guests.add(guest);
        return true;
    }
    
    public static boolean login(String username, String password) 
    {
        for (Guest g : guests) 
        {
            if (g.getUsername().equalsIgnoreCase(username) && g.getPassword().equals(password)) 
            {
                loggedInGuest = g;
                return true;
            }
        }
        return false;
    }
    
    public static Guest getLoggedInGuest() 
    { 
        return loggedInGuest; 
    }

    public static ArrayList<Guest> getAllGuests() 
    { 
        return guests; 
    }
    
    public static void setBooking(Booking booking) 
    { 
       loggedInGuest.setBooking(booking); 
    }
    public static Booking getBooking() 
    { 
       return loggedInGuest.getBooking(); 
    }
    
    public static void setCurrentRoom(Room room) 
    { 
        currentRoom = room; 
    }

    public static Room getCurrentRoom() 
    { 
        return currentRoom; 
    }
   
    public static void addServiceCost(double cost) 
    { 
        loggedInGuest.addServiceCost(cost); 
    }
    public static double getServicesCost() 
    { 
        return loggedInGuest.getServicesCost(); 
    }
    public static void resetServicesCost() 
    { 
        loggedInGuest.resetServicesCost(); 
    }

    public static void addFoodCost(double cost) 
    { 
        loggedInGuest.addFoodCost(cost); 
    }
    public static double getFoodCost() 
    { 
        return loggedInGuest.getFoodCost(); 
    }
    public static void resetFoodCost() 
    { 
        loggedInGuest.resetFoodCost(); 
    }
    
    public static void setLoggedInGuest(Guest guest) { //added this function for the queries using file handling
        loggedInGuest = guest;
    }
    
    private static String checkInTime = null; //add this data for checkInTime

    public static void setCheckInTime(String time) { //setter
        checkInTime = time; 
    }

    public static String getCheckInTime() { //getters
        return checkInTime; 
    }
    
    public static void logout() 
    { 
        loggedInGuest = null;
        currentRoom = null;
    }
}
 
    

