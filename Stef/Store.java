import java.util.ArrayList;
import java.util.Random;

public class Store
{
    int Day;
    //list of tools
    int toolsLeft;
    ArrayList<Tool> Tools;
    //another list customers that can rent
    ArrayList<Customer> Customers;

    ArrayList<Rental> ActiveRentals;
    ArrayList<Rental> AllRentals;
    ArrayList<Rental> CompletedRentals;

    ArrayList<Customer> availableCustomers;
    ArrayList<Customer> unavailableCustomers;

    ArrayList<Tool> ToolsRented;
    ArrayList<Tool> ToolsNotRented;

    int Money;
    int MoneyToday;

    //rental id  print out rentals over the whole month.
    int rentalsSoFar;

    public Store()
    {
        this.Day  = 0;
        //probaly list of tools
        this.toolsLeft = 25;

        createTools();
        createCustomers();
    }
    public int getRentTime(int maxAllowed,int minAllowed)
    {
        Random random = new Random();
        //fix this
        int randomInteger = random.nextInt((maxAllowed-minAllowed)+1)+minAllowed;
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
        this.Tools.add(paintingTool1);

        PaintingTool paintingTool2 = new PaintingTool("paintingTool2");
        this.Tools.add(paintingTool2);

        PaintingTool paintingTool3 = new PaintingTool("paintingTool3");
        this.Tools.add(paintingTool3);

        PaintingTool paintingTool4 = new PaintingTool("paintingTool4");
        this.Tools.add(paintingTool4);

        PaintingTool paintingTool5 = new PaintingTool("paintingTool5");
        this.Tools.add(paintingTool5);


        YardworkTool yardworkTool1 = new YardworkTool("yardworkTool1");
        this.Tools.add(yardworkTool1);

        YardworkTool yardworkTool2 = new YardworkTool("yardworkTool2");
        this.Tools.add(yardworkTool2);

        YardworkTool yardworkTool3 = new YardworkTool("yardworkTool3");
        this.Tools.add(yardworkTool3);

        YardworkTool yardworkTool4 = new YardworkTool("yardworkTool4");
        this.Tools.add(yardworkTool4);

        YardworkTool yardworkTool5 = new YardworkTool("yardworkTool5");
        this.Tools.add(yardworkTool5);
    }

    public void createCustomers()
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
        this.ToolsNotRented.clear();
        this.ToolsRented.clear();
        for (Tool item : Tools) 
        { 
            if (item.isRented == false) 
            {
                this.ToolsNotRented.add(item);
            }
            else
            {
                this.ToolsRented.add(item);
            }
        }
    }

    public void RunDay()
    {
        System.out.println("Today is Day"+this.Day);
        printCompletedRentals(this.CompletedRentals);
        PrintActiveRentals(this.ActiveRentals);
        PrintToolsLeft(this.ToolsRented);
        System.out.print("We made"+ this.MoneyToday +"today" );  
    }

    public void CloseStore()
    {
        System.out.print("Over 35 days we had"+ this.AllRentals.size());
        System.out.print("For a total of $"+ this.Money );
    }

    public void printCompletedRentals(ArrayList<Rental> Rentals)
    {
        System.out.println("There are currently "+ Rentals.size()+ "completed rentals." );
        for (Rental item : Rentals)
        {
            System.out.print(item.rentalID );
            System.out.print("Rented to" + item.customer.Name);
            System.out.print("Contaning Tools:" );
            for (Tool tool : item.tools)
            {
                System.out.print(tool.name);
            }
            System.out.print("With" + item.numberOfGear+ "Protective Gear");
            System.out.print(item.numberOfKits+ "Accessory Kits and");
            System.out.print(item.numberofCords+ " extension cords.");
            System.out.print(item.numberOfKits+ "Accessory Kits");
            System.out.print("for" + item.rentalLength + "days");
            System.out.print("for a total of " + item.totalCost);
        }
    }

    public void PrintActiveRentals(ArrayList<Rental> Rentals)
    {
        System.out.println("There are currently "+ Rentals.size()+ "active rentals." );
        for (Rental item : Rentals)
        {
            System.out.print(item.rentalID );
            System.out.print("Rented to" + item.customer.Name);
            System.out.print("Contaning Tools:" );
            for (Tool tool : item.tools)
            {
                System.out.print(tool.name);
            }
            System.out.print("With" + item.numberOfGear+ "Protective Gear");
            System.out.print(item.numberOfKits+ "Accessory Kits and");
            System.out.print(item.numberofCords+ " extension cords.");
            System.out.print(item.numberOfKits+ "Accessory Kits");
            System.out.print("with" + item.daysLeftOnRental + "days left on rental");
            System.out.print("for a total of " + item.totalCost);
        }
    }

    public void PrintToolsLeft(ArrayList<Tool> Tools)
    {
        System.out.println("There are currently "+ ToolsNotRented.size()+ "tools left" );
        for(Tool tool : Tools)
        {
            System.out.print(tool.name);
        }
    }
}