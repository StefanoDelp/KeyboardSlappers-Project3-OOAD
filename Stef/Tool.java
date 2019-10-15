
public abstract class Tool
{
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
    }

    public void ReturnTool()
    {
        this.isRented = false;
    }

}