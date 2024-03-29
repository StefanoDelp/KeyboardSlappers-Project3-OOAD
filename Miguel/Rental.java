import java.util.ArrayList;

public class Rental
{
    int rentalID;
    int daysLeftOnRental;
    int numberOfTools;
    int totalCost;
    ArrayList<Tool> tools;
    Customer customer;
    int rentalLength;

    //going to need this to take in 3 more things for all the extenstions 
    public Rental(Customer customer,ArrayList<Tool> tools,int nights,int numberofCords,int numberOfKits,int numberOfGear)
    {
        this.numberOfTools = tools.size();
        //customer.RentTool(tool, Nights);
        this.tools = tools;
        this.customer = customer;
        this.rentalLength = nights;
        this.daysLeftOnRental = nights;
        this.totalCost = GetTotalPrice(tools, nights, numberofCords, numberOfKits, numberOfGear);
        Rent(customer,tools);
    }

    public int GetTotalPrice(ArrayList<Tool> tools,int nights,int numberofCords,int numberOfKits,int numberOfGear)
    {
        int total = 0;
        for (Tool item : tools) 
        {
            total = total + item.pricePerDay;
        }
        ExtensionCord Cord = new ExtensionCord();
        ProtectiveGear Gear = new ProtectiveGear();
        Accessory accessory = new Accessory();
        total = total + ( Cord.Price * numberofCords);
        total = total + ( Gear.Price *numberOfGear);
        total = total + ( accessory.Price *numberOfKits);
        return total;
    }

    public void Rent(Customer customer,ArrayList<Tool> tools)
    {
        customer.RentTool(this);
        for (Tool item : tools) 
        {
            item.GettingRented(this.daysLeftOnRental);
        }
    }
    public void Return (Customer customer,ArrayList<Tool> tools)
    {
        customer.ReturnTools(this.rentalID);
        for (Tool item : tools) 
        {
            item.ReturnTool();
        }
    }
}