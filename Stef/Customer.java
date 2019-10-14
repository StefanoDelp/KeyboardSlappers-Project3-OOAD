import java.util.*;

public class Customer
{
    int CustomerType;
    ArrayList<Rental> rentals;
    int maxTools;
    int MinTools;
    int maxNights;
    boolean canRent;
    int minNights;
    int ToolsCanRentCurrently;
    static String Name;

    public Customer(String NewName)
    {
        this.Name = NewName;
        this.canRent = true;
        this.ToolsCanRentCurrently = maxTools;
    }

    //I dont know if this is still needed.
    public void RentTool(Rental rental)
    {
        this.rentals.add(rental);
        this.ToolsCanRentCurrently = this.ToolsCanRentCurrently - rental.numberOfTools;
        this.canRent = checkIfCanRent();
    }

    // this could also move to rental if needed 
    public void ReturnTools(int rentalID)
    {
        Rental Found = null;
        this.canRent = true;
        for (Rental item : rentals) 
        {
            if(item.rentalID == rentalID)
            {
                Found = item;
            }
        }
        if(Found != null)
        {
            rentals.remove(Found);
        }
    }
    

    //function needs to be fixed.
    public boolean checkIfCanRent()
    {
        if(this.ToolsCanRentCurrently < maxTools)
        {
            return true;
        }
        return false;
    }

}