public class BusinessCustomer extends Customer
{
    public BusinessCustomer(String Name)
    {
        super(Name);
        this.CustomerType = 3;
        this.maxTools = 3;
        this.maxNights = 7;
        this.MinTools = 3;
        this.ToolsCanRentCurrently = maxTools;
    }
}