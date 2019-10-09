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
    }
    public Integer getPricePerDay()
    {
        return pricePerDay;
    }

}