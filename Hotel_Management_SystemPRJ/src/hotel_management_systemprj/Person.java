package hotel_management_systemprj;

public class Person {
    private String FullName;
    private String Email;
    private String PhoneNumber;

    public Person(String name, String email, String phoneNumber) 
    {
        this.FullName = name;
        this.Email = email;
        this.PhoneNumber = phoneNumber;
    }

    public String getFullName()
    { 
        return FullName; 
    }
    public String getEmail()
    { 
        return Email; 
    }
    public String getPhoneNumber()
    { 
        return PhoneNumber; 
    }

    public void setName(String name)               
    { 
        this.FullName = name; 
    }
    public void setEmail(String email)             
    { 
        this.Email = email; 
    }
    public void setPhoneNumber(String phoneNumber) 
    { 
        this.PhoneNumber = phoneNumber; 
    }
}
    

