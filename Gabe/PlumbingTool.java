import java.util.jar.Attributes.Name;

public class PlumbingTool extends Tool
{
    public PlumbingTool(String Name) {
        super(Name);
        this.name = Name;
        this.pricePerDay = 15;
        this.isRented = false;
    }
    
}