import java.util.ArrayList;


import com.sun.tools.javac.code.Attribute.Array;
public class Store
{
    int daysLeftInMonth;
    int toolsLeft;
    ArrayList<Tool> Tools;
    ArrayList<Customer> Customers;
    ArrayList<Customer> availableCustomers;
    ArrayList<Customer> unavailableCustomers;
    ArrayList<Customer> availableTools;
    ArrayList<Customer> unavailableTools;

    public Store()
    {
        this.daysLeftInMonth  = 35;
        this.toolsLeft = 25;
        createTools();
        createCustomers();
    }
    
    public int getRentTime(int maxAllowed)
    {
        return 1;
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
    /*
    On each day, a random number of customers will visit the store as long as there 
    are tools to rent.  Each customer will create one Rental Record that follows the 
    rules of their associated type before they leave the store.  That is, no customer 
    will show up and then leave without making a rental.  Note: if the store has less 
    than 3 tools, then a Business customer will NOT arrive (as they wouldn't be able 
    to create a Rental that follows their rules).  As soon as the store has zero tools, 
    customers will magically stop arriving until tools are once again available.
    */
    public void createCustomers()
    {
        CasualCustomer casualCustomer1 = new CasualCustomer();
        this.Customer.add(casualCustomer1);

        CasualCustomer casualCustomer2 = new CasualCustomer();
        this.Customer.add(casualCustomer2);

        CasualCustomer casualCustomer3 = new CasualCustomer();
        this.Customer.add(casualCustomer3);

        CasualCustomer casualCustomer4 = new CasualCustomer();
        this.Customer.add(casualCustomer4);


        BusinessCustomer businessCustomer1 = new BusinessCustomer();
        this.Customer.add(businessCustomer1);

        BusinessCustomer businessCustomer2 = new BusinessCustomer();
        this.Customer.add(businessCustomer2)

        BusinessCustomer businessCustomer3 = new BusinessCustomer();
        this.Customer.add(businessCustomer3)

        BusinessCustomer businessCustomer4 = new BusinessCustomer();
        this.Customer.add(businessCustomer4)


        RegularCustomer regularCustomer1 = new RegularCustomer();
        this.Customer.add(regularCustomer1);

        RegularCustomer regularCustomer2 = new RegularCustomer();
        this.Customer.add(regularCustomer2);

        RegularCustomer regularCustomer3 = new RegularCustomer();
        this.Customer.add(regularCustomer3);

        RegularCustomer regularCustomer4 = new RegularCustomer();
        this.Customer.add(regularCustomer4);
    }

    public void CheckCustomner()
    {
        this.unavailableCustomers.clear();
        this.availableCustomers.clear();
        for (Customer item : Customers) 
        { 
            if (item.canRent == true) 
            {
                this.availableCustomers.add(item);
            }
            else
            {
                this.unavailableCustomers.add(item);
            }
        }
    }

    public void CheckTools()
    {
        this.unavailableTools.clear();
        this.availableTools.clear();
        for (Tool item : Tools) 
        { 
            if (item.canRent == false) 
            {
                this.availableTools.add(item);
            }
            else
            {
                this.unavailableTools.add(item);
            }
        }
    }


}