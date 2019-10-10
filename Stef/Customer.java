import java.util.*;

public class Customer
{
    
    ArrayList<Rental> rentals;
    int maxTools;
    int maxNights;
    boolean canRent;


    //I dont know if this is still needed.
    public void RentTool(Rental rental)
    {
        this.rentals.add(rental);
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
    
    public boolean checkIfCanRent()
    {
        if(rentals.size() < maxTools)
        {
            return true;
        }
        return false;
    }

}