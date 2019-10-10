import java.util.ArrayList;

public class Rental
{
    int daysLeftOnRental;
    int numberOfTools;
    int totalCost;
    //going to need this to take in 3 more things for all the extenstions 
    public Rental(Customer customer,ArrayList<Tool> tools,int nights)
    {
        this.numberOfTools = tools.size();
        //customer.RentTool(tool, Nights);
    }
}