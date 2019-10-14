public class CasualCustomer extends Customer
{
    public CasualCustomer(String Name)
    {
        super(Name);
        this.CustomerType = 2;
        this.maxTools = 2;
        this.maxNights = 2;
        this.MinTools = 1;
        this.minNights = 1;
        this.ToolsCanRentCurrently = maxTools;
    }

}