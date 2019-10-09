import java.util.jar.Attributes.Name;

public class ConcreteTool extends Tool
{
    public ConcreteTool(String Name) {
        super(Name);
        this.name = Name;
        this.pricePerDay = 50;
        this.isRented = false;
    }
    
}