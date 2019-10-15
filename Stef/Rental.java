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
    int numberofCords;
    int numberOfKits;
    int numberOfGear;

    //going to need this to take in 3 more things for all the extenstions 
    public Rental(Customer customer,ArrayList<Tool> tools,int nights,int numberofCords,int numberOfKits,int numberOfGear,int rentalID)
    {
        this.numberOfTools = tools.size();
        this.tools = tools;
        this.rentalID = rentalID;
        this.customer = customer;
        this.rentalLength = nights;
        this.daysLeftOnRental = nights;
        this.numberOfGear = numberOfGear;
        this.numberOfKits = numberOfKits;
        this.numberofCords = numberofCords;
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
    
    public void TakeAwayDay()
    {
        if(this.daysLeftOnRental >= 1 )
        {
            this.daysLeftOnRental = this.daysLeftOnRental -1;
        }
        if(this.daysLeftOnRental == 0)
        {
            Return(this.customer, this.tools);
        }
    }


}