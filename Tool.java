import java.util.*;
public abstract class Tool
{
    Integer dayyLeftOnRent;
    Integer pricePerDay;
    String name;

    public Tool(String Name,Integer Price)
    {
        this.pricePerDay = Price;
        this.name = Name;
    }
    public Integer getPricePerDay()
    {
        return pricePerDay;
    }

}