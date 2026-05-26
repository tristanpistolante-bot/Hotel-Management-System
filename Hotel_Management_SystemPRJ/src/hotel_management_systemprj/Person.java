package hotel_management_systemprj;

public class Person {
    private String FullName;
    private String PhoneNumber;

    public Person(String name, String phoneNumber) 
    {
        this.FullName = name;
        this.PhoneNumber = phoneNumber;
    }

    public String getFullName()
    { 
        return FullName; 
    }
    public String getPhoneNumber()
    { 
        return PhoneNumber; 
    }

    public void setName(String name)               
    { 
        this.FullName = name; 
    }
    
    public void setPhoneNumber(String phoneNumber) 
    { 
        this.PhoneNumber = phoneNumber; 
    }
}
    

