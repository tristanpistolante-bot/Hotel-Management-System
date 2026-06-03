package hotel_management_systemprj;

public class Booking 
{
    private Guest guest;
    private Room room;
    private int NumberOfNights;
    private double TotalCost;
    private String checkInDate;

    public Booking(Guest guest, Room room, int numberOfNights, String checkInDate) 
    {
        this.guest = guest;
        this.room = room;
        this.NumberOfNights = numberOfNights;
        this.TotalCost = room.calculatePrice(numberOfNights);
        this.checkInDate = checkInDate;
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
    
    public String getCheckInDate() 
    { 
        return checkInDate; 
    }
    
    public double calculatePrice(int nights) 
    {
        return room.getPricePerNight() * nights;
    }

    public double calculatePrice(int nights, double servicesCost, double foodCost) 
    {
        return (room.getPricePerNight() * nights) + servicesCost + foodCost;
    }
}
