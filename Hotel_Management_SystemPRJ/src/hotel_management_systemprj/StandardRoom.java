package hotel_management_systemprj;

public class StandardRoom extends Room 
{
    public StandardRoom() 
    {
        super("Standard Room", 99.00, "Queen Bed, WiFi, TV, Mini Fridge");
    }
    
    @Override
        public double calculatePrice(int nights) 
    {
        return getPricePerNight() * nights;
    }
}
