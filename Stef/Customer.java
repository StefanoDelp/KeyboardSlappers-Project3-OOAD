import java.util.*;

public class Customer
{
    int CustomerType;
    ArrayList<Rental> rentals;
    int maxTools;
    Boolean RentedToday;
    int MinTools;
    int maxNights;
    boolean canRent;
    int minNights;
    int ToolsCanRentCurrently;
    String Name;

    public Customer(String NewName)
    {
        this.Name = NewName;
        this.canRent = true;
        this.ToolsCanRentCurrently = maxTools;
        this.rentals = new ArrayList<>();
        this.RentedToday = false;
    }

    //I dont know if this is still needed.
    public void RentTool(Rental rental)
    {
        this.rentals.add(rental);
        this.ToolsCanRentCurrently = this.ToolsCanRentCurrently - rental.numberOfTools;
        this.canRent = checkIfCanRent();
        this.RentedToday = true;
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
            this.ToolsCanRentCurrently = this.ToolsCanRentCurrently + Found.numberOfTools;
            rentals.remove(Found);
        }
        checkIfCanRent();
    }
    

    //function needs to be fixed.
    public boolean checkIfCanRent()
    {
        if(this.ToolsCanRentCurrently > 0)
        {
            this.canRent = true;
            return true;
        }
        this.canRent = false;
        return false;
    }

}