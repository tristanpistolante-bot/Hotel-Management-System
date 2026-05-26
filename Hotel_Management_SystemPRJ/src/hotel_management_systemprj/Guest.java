package hotel_management_systemprj;

public class Guest extends Person {
    private String Username;
    private String Password;
    private Booking booking = null;
    private double servicesCost = 0.0;
    private double foodCost = 0.0;

    public Guest(String name, String phoneNumber, String username, String password) 
    {
        super(name, phoneNumber);
        this.Username = username;
        this.Password = password;
    }

    public String getUsername() 
    { 
        return Username; 
    }
    public String getPassword() 
    { 
        return Password; 
    }

    public void setUsername(String username) 
    { 
        this.Username = username; 
    }
    public void setPassword(String password) 
    { 
        this.Password = password; 
    }
    
    public Booking getBooking()              
    { 
        return booking; 
    }
    public void setBooking(Booking booking)  
    { 
        this.booking = booking; 
    }

    public double getServicesCost()          
    { 
        return servicesCost; 
    }
    public void addServiceCost(double cost)  
    { 
        this.servicesCost += cost; 
    }
    public void resetServicesCost()          
    { 
        this.servicesCost = 0.0; 
    }
    public double getFoodCost()              
    { 
        return foodCost; 
    }
    public void addFoodCost(double cost)     
    { 
        this.foodCost += cost; 
    }
    public void resetFoodCost()              
    { 
        this.foodCost = 0.0; 
    }
}
