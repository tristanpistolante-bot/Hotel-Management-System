package hotel_management_systemprj;

import java.util.ArrayList;

public class HotelData 
{
    private static ArrayList<Guest> guests = new ArrayList<>();

    public static boolean registerGuest(Guest guest) 
    {
        for (Guest g : guests) 
        {
            if (g.getUsername().equalsIgnoreCase(guest.getUsername())) 
            {
                return false; // username already taken
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
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Guest> getAllGuests() 
    { 
        return guests; 
    }
}
 
    

