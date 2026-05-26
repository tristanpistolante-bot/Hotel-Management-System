package hotel_management_systemprj;

public class Room 
{
    private String RoomType;
    private double PricePerNight;
    private String Amenities;
    private boolean isAvailable;

    public Room(String roomType, double pricePerNight, String amenities) 
    {
        this.RoomType = roomType;
        this.PricePerNight = pricePerNight;
        this.Amenities = amenities;
        this.isAvailable = true;
    }

    public String getRoomType()
    { 
        return RoomType; 
    }
    
    public double getPricePerNight() 
    { 
        return PricePerNight; 
    }
    
    public String getAmenities()     
    { 
        return Amenities; 
    }
    
    public boolean isAvailable()     
    { 
        return isAvailable; 
    }

    public void setAvailable(boolean available) 
    { 
        this.isAvailable = available; 
    }
    
       public double calculatePrice(int nights) 
    {
        return PricePerNight * nights;
    }
      
    public double calculatePrice(int nights, double foodCost) 
    {
        return (getPricePerNight() * nights) + foodCost;
    }   
}
