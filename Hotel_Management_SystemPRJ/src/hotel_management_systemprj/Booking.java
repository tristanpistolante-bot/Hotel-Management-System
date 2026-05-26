package hotel_management_systemprj;

public class Booking 
{
    private Guest guest;
    private Room room;
    private int NumberOfNights;
    private double TotalCost;

    public Booking(Guest guest, Room room, int numberOfNights) 
    {
        this.guest = guest;
        this.room = room;
        this.NumberOfNights = numberOfNights;
        this.TotalCost = room.calculatePrice(numberOfNights);
    }

    public Guest getGuest()        
    { 
        return guest; 
    }
    public Room getRoom()          
    { 
        return room; 
    }
    public int getNumberOfNights() 
    { 
        return NumberOfNights; 
    }
    public double getTotalCost()   
    { 
        return TotalCost; 
    }
}
