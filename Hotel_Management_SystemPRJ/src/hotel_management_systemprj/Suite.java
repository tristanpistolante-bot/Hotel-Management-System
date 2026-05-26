package hotel_management_systemprj;

public class Suite extends Room 
{
    public Suite() 
    {
        super("Suite", 249.00, "King Bed, WiFi, Smart TV, Jacuzzi, Ocean View, Balcony");
    }

    @Override
    public double calculatePrice(int nights) 
    {
        return getPricePerNight() * nights * 1.20; // 20% service charge

    }
}
