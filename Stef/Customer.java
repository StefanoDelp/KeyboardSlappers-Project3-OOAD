import java.util.*;

public class Customer
{
    int daysLeftOnRental;
    ArrayList<Tool> toolsRented;
    int maxTools;
    int maxNights;
    boolean canRent;


    public void RentTool(Tool tool,int Nights)
    {
        this.toolsRented.add(tool);
        this.daysLeftOnRental = Nights;
        this.canRent = false;
    }
    public void ReturnTools()
    {
        this.daysLeftOnRental = 0 ;
        this.toolsRented.clear();
        this.canRent = true;
    }

}