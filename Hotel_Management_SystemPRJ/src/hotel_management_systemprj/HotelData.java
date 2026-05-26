package hotel_management_systemprj;

import java.util.ArrayList;

public class HotelData 
{
    private static ArrayList<Guest> guests = new ArrayList<>();
    private static Guest loggedInGuest = null;
    private static Booking currentBooking = null;
    private static Room currentRoom = null;
    private static double servicesCost = 0.0;
    private static double foodCost = 0.0;

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
        currentBooking = booking; 
    }

    public static Booking getBooking() 
    { 
        return currentBooking; 
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
        servicesCost += cost; 
    }

    public static double getServicesCost() 
    { 
        return servicesCost; 
    }

    public static void resetServicesCost() 
    { 
        servicesCost = 0.0; 
    }
    
    public static void addFoodCost(double cost) 
    { 
        foodCost += cost; 
    }

    public static double getFoodCost() 
    { 
        return foodCost; 
    }

    public static void resetFoodCost() 
    { 
        foodCost = 0.0; 
    }
    }
 
    

