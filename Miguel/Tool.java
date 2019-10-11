import java.util.*;
public abstract class Tool
{
    Integer dayyLeftOnRent;
    Integer pricePerDay;
    String name;
    Boolean isRented;

    public Tool(String Name)
    {
        this.pricePerDay = null;
        this.name = Name;
        this.isRented = false;
    }
    public Integer getPricePerDay()
    {
        return pricePerDay;
    }
    public void GettingRented(int nights)
    {
        this.isRented = true;
        this.dayyLeftOnRent = nights;   
    }

    public void ReturnTool()
    {
        this.isRented = false;
        this.dayyLeftOnRent = 0;
    }

}