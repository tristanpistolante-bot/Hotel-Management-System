package hotel_management_systemprj;

public class DeluxeRoom extends Room 
{
    public DeluxeRoom() 
    {
        super("Deluxe Room", 149.00, "King Bed, WiFi, Smart TV, Mini Bar, City View");
    }

    @Override
    public double calculatePrice(int nights) 
    {
        return getPricePerNight() * nights;
    }
}
