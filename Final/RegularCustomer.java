public class RegularCustomer extends Customer
{
    public RegularCustomer(String Name)
    {
        super(Name);
        this.CustomerType =1;
        this.maxTools = 2;
        this.maxNights = 5;
        this.MinTools = 1;
        this.minNights = 3;
        this.ToolsCanRentCurrently = maxTools;
    }

}
