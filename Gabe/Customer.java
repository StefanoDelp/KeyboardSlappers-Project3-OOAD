import java.util.*;

public class Customer
{
    ArrayList<Rental> rentals;
    int maxTools;
    int maxNights;
    boolean canRent;

    public void RentTool(Rental rental)
    {
        this.rentals.add(rental);

        this.canRent = false;
    }
    public void ReturnTools()
    {
        this.rentals.clear();
        this.canRent = true;
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