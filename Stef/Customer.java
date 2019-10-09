import java.util.*;

public abstract class Customer
{
    int daysLeftOnRental;
    ArrayList<Tool> toolsRented;
    int maxTools;
    int maxNights;

    public abstract void RentTool(Tool tool);

}