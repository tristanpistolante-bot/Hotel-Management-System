package hotel_management_systemprj;

public class Guest extends Person {
    private String Username;
    private String Password;

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
}
