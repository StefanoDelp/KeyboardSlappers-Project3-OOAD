import java.util.jar.Attributes.Name;

public class YardworkTool extends Tool
{
    public YardworkTool(String Name) {
        super(Name);
        this.name = Name;
        this.pricePerDay = 10;
        this.isRented = false;
    }
    
}