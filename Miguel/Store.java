import java.util.ArrayList;
import java.util.Random;

public class Store
{
    int daysLeftInMonth;
    int toolsLeft;
    ArrayList<Tool> Tools;
    ArrayList<Customer> Customers;
    ArrayList<Rental> ActiveRentals;
    ArrayList<Rental> AllRentals;

    public Store()
    {
        this.daysLeftInMonth  = 35;
        this.toolsLeft = 25;
        createTools();
        createCustomers();
    }
    public int getRentTime(int maxAllowed)
    {
        Random random = new Random();
        int randomInteger = random.nextInt(10);
        return randomInteger;
    }

    public void createTools()
    {
        WoodworkingTool woodworkingTool1 = new WoodworkingTool("woodworkingTool1");
        this.Tools.add(woodworkingTool1);

        WoodworkingTool woodworkingTool2 = new WoodworkingTool("woodworkingTool2");
        this.Tools.add(woodworkingTool2);

        WoodworkingTool woodworkingTool3 = new WoodworkingTool("woodworkingTool3");
        this.Tools.add(woodworkingTool3);

        WoodworkingTool woodworkingTool4 = new WoodworkingTool("woodworkingTool4");
        this.Tools.add(woodworkingTool4);

        WoodworkingTool woodworkingTool5 = new WoodworkingTool("woodworkingTool5");
        this.Tools.add(woodworkingTool5);


        PlumbingTool plumbingTool1 = new PlumbingTool("plumblingTool1");
        this.Tools.add(plumbingTool1);

        PlumbingTool plumbingTool2 = new PlumbingTool("plumbingTool2");
        this.Tools.add(plumbingTool2);

        PlumbingTool plumbingTool3 = new PlumbingTool("plumbingTool3");
        this.Tools.add(plumbingTool3);

        PlumbingTool plumbingTool4 = new PlumbingTool("plumbingTool4");
        this.Tools.add(plumbingTool4);

        PlumbingTool plumbingTool5 = new PlumbingTool("plumbingTool5");
        this.Tools.add(plumbingTool5);


        ConcreteTool concreteTool1 = new ConcreteTool("concreteTool1");
        this.Tools.add(concreteTool1);

        ConcreteTool concreteTool2 = new ConcreteTool("concreteTool2");
        this.Tools.add(concreteTool2);

        ConcreteTool concreteTool3 = new ConcreteTool("concreteTool3");
        this.Tools.add(concreteTool3);

        ConcreteTool concreteTool4 = new ConcreteTool("concreteTool4");
        this.Tools.add(concreteTool4);

        ConcreteTool concreteTool5 = new ConcreteTool("concreteTool5");
        this.Tools.add(concreteTool5);


        PaintingTool paintingTool1 = new PaintingTool("paintTool1");
        Tools.add(paintingTool1);

        PaintingTool paintingTool2 = new PaintingTool("paintingTool2");
        Tools.add(paintingTool2);

        PaintingTool paintingTool3 = new PaintingTool("paintingTool3");
        Tools.add(paintingTool3);

        PaintingTool paintingTool4 = new PaintingTool("paintingTool4");
        Tools.add(paintingTool4);

        PaintingTool paintingTool5 = new PaintingTool("paintingTool5");
        Tools.add(paintingTool5);


        YardworkTool yardworkTool1 = new YardworkTool("yardworkTool1");
        Tools.add(yardworkTool1);

        YardworkTool yardworkTool2 = new YardworkTool("yardworkTool2");
        Tools.add(yardworkTool2);

        YardworkTool yardworkTool3 = new YardworkTool("yardworkTool3");
        Tools.add(yardworkTool3);

        YardworkTool yardworkTool4 = new YardworkTool("yardworkTool4");
        Tools.add(yardworkTool4);

        YardworkTool yardworkTool5 = new YardworkTool("yardworkTool5");
        Tools.add(yardworkTool5);




    }

    public void createCustomers()
    {
        
    }
}