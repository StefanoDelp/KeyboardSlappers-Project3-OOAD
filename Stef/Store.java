import java.util.ArrayList;
import java.util.Random;
import java.util.*; 


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
        this.Tools = new ArrayList<Tool>();
        this.ActiveRentals = new ArrayList<>();
        this.AllRentals = new ArrayList<>();
        this.CompletedRentals = new ArrayList<>();
        this.Customers = new ArrayList<>();
        this.availableCustomers = new ArrayList<>();
        this.unavailableCustomers = new ArrayList<>();
        this.ToolsRented = new ArrayList<>();

        createTools();
        createCustomers();
        this.ToolsNotRented = (ArrayList) this.Tools.clone();
        this.availableCustomers = (ArrayList) this.Customers.clone();
    }
    public int getRentTime(int maxAllowed,int minAllowed)
    {
        Random random = new Random();
        //fix this
        int randomInteger = random.nextInt((maxAllowed-minAllowed)+1)+minAllowed;
        return randomInteger;
    }

    public void createCustomers()
    {
        BusinessCustomer businessCustomer1 = new BusinessCustomer("businessCustomer1");
        BusinessCustomer businessCustomer2 = new BusinessCustomer("businessCustomer2");
        BusinessCustomer businessCustomer3 = new BusinessCustomer("businessCustomer3");
        BusinessCustomer businessCustomer4 = new BusinessCustomer("businessCustomer4");

        CasualCustomer casualCustomer1 = new CasualCustomer("casualCustomer1");
        CasualCustomer casualCustomer2 = new CasualCustomer("casualCustomer2");
        CasualCustomer casualCustomer3 = new CasualCustomer("casualCustomer3");
        CasualCustomer casualCustomer4 = new CasualCustomer("casualCustomer4");

        RegularCustomer regularCustomer1 = new RegularCustomer("regularCustomer1");
        RegularCustomer regularCustomer2 = new RegularCustomer("regularCustomer2");
        RegularCustomer regularCustomer3 = new RegularCustomer("regularCustomer3");
        RegularCustomer regularCustomer4 = new RegularCustomer("regularCustomer4");
        
        this.Customers.add(businessCustomer1);
        this.Customers.add(businessCustomer2);
        this.Customers.add(businessCustomer3);
        this.Customers.add(businessCustomer4);

        this.Customers.add(casualCustomer1);
        this.Customers.add(casualCustomer2);
        this.Customers.add(casualCustomer3);
        this.Customers.add(casualCustomer4);

        this.Customers.add(regularCustomer1);
        this.Customers.add(regularCustomer2);
        this.Customers.add(regularCustomer3);
        this.Customers.add(regularCustomer4);




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

    public void CheckCustomers()
    {
        this.unavailableCustomers.clear();
        this.availableCustomers.clear();
        ArrayList<Customer> Good = new ArrayList<>();
        ArrayList<Customer> bad = new ArrayList<>();
        for (Customer item : this.Customers) 
        { 
            
            if (item.canRent == true && item.RentedToday == false && item.ToolsCanRentCurrently > 0) 
            {
                Good.add(item);
            }
            else
            {
                bad.add(item);
            }
        }
        this.availableCustomers = Good;
        this.unavailableCustomers = bad;
    }

    public void CheckTools()
    {
        this.ToolsNotRented.clear();
        this.ToolsRented.clear();
        ArrayList<Tool> Good = new ArrayList<>();
        ArrayList<Tool> bad = new ArrayList<>();
        for (Tool item : this.Tools) 
        { 
            if (item.isRented == false) 
            {
                Good.add(item);
            }
            else
            {
                bad.add(item);
            }
        }
        this.ToolsRented = bad;
        this.ToolsNotRented = Good;
    }
    public void CheckRentals()
    {
        ArrayList<Rental> completedRentals = new ArrayList<>();
        for(Rental item  : ActiveRentals )
        {
            if(item.daysLeftOnRental == 0)
            {
                completedRentals.add(item);
                this.CompletedRentals.add(item);
            }
        }
        for(Rental item  : completedRentals )
        {
            this.ActiveRentals.remove(item);
        }
    }


    public void RunDay()
    {
        
        this.MoneyToday = 0;
        this.Day = this.Day + 1;
        SimulateDay();
        EndDay();
        System.out.println("");
        System.out.println("Today is Day "+this.Day);
        printCompletedRentals(this.CompletedRentals);
        PrintActiveRentals(this.ActiveRentals);
        PrintToolsLeft(this.ToolsRented);
        System.out.println("We made $"+ this.MoneyToday +" today " );
    }

    public void EndDay()
    {
        for (Rental item :this.ActiveRentals)
        {
            item.TakeAwayDay();
            this.Money = this.MoneyToday + this.Money;
        }
        for (Customer item : this.Customers)
        {
            item.RentedToday = false;
        }
    }

    public void CloseStore()
    {
        System.out.println("");
        System.out.println("");
        System.out.println("Over 35 days we had "+ this.AllRentals.size()+ " Rentals");
        int reg = 0;
        int bus = 0;
        int cas = 0;
        for(Rental item : this.AllRentals)
        {
            if(item.customer.CustomerType == 1)
            {
                reg = reg +1;
            }
            else if (item.customer.CustomerType == 2)
            {
                cas = cas +1;
            }
            else
            {
                bus = bus + 1;
            }
        }
        System.out.println("Of thoose rentals");
        System.out.println(reg+ " were Regular Customers.");
        System.out.println(bus+ " were Business Customers.");
        System.out.println(cas+ " were Casual Customers.");


        System.out.println("For a total of $"+ this.Money);
    }

    public void printCompletedRentals(ArrayList<Rental> Rentals)
    {
        System.out.println("There are currently "+ Rentals.size()+ " completed rentals. " );
        for (Rental item : Rentals)
        {
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Rental ID: " + item.rentalID );
            System.out.println("Rented to " + item.customer.Name);
            System.out.println("Contaning Tools: " );
            for (Tool tool : item.tools)
            {
                System.out.println(tool.name);
            }
            System.out.println("");
            System.out.println("With the following added.");
            System.out.println(item.numberOfGear+ " Protective Gear");
            System.out.println(item.numberOfKits+ " Accessory Kits and ");
            System.out.println(item.numberofCords+ " extension cords. ");
            System.out.println(item.numberOfKits+ " Accessory Kits ");
            System.out.println("for " + item.rentalLength + " days");
            System.out.println("for a total of " + item.totalCost);
        }
    }

    public void PrintActiveRentals(ArrayList<Rental> Rentals)
    {
        System.out.println("");
        System.out.println("");
        System.out.println("There are currently "+ Rentals.size()+ " active rentals. " );
        for (Rental item : Rentals)
        {
            System.out.println("RentalID: " + item.rentalID );
            System.out.println("Rented to " + item.customer.Name);
            System.out.println("Contaning Tools:" );
            for (Tool tool : item.tools)
            {
                System.out.println(tool.name);
            }
            System.out.println("");
            System.out.println("With the following added.");
            System.out.println(item.numberOfGear+ " Protective Gear");
            System.out.println(item.numberOfKits+ " Accessory Kits and");
            System.out.println(item.numberofCords+ " extension cords.");
            System.out.println(item.numberOfKits+ " Accessory Kits");
            System.out.println("");
            System.out.println("with " + item.daysLeftOnRental + " days left on rental");
            System.out.println("for a total of " + item.totalCost);
        }
    }

    public void PrintToolsLeft(ArrayList<Tool> Tools)
    {
        System.out.println("There are currently "+ ToolsNotRented.size()+ " tools left" );
        for(Tool tool : this.ToolsNotRented)
        {
            System.out.println(tool.name);
        }
    }

    public void SimulateDay()
    {
        CheckCustomers();
        CheckTools();
        CheckRentals();
        Boolean IsRentStillGoing = true;
        while(IsRentStillGoing == true)
        {
            IsRentStillGoing = TryRental();
        }
        
    }
    public boolean TryRental()
    {
        CheckCustomers();
        CheckTools();
        Random rand = new Random(); 
        if(this.ToolsNotRented.size() >= 3 && this.availableCustomers.size() > 0)
        {
            Customer pickeCustomer = this.availableCustomers.get(rand.nextInt(this.availableCustomers.size()));
            int randomInteger;
            int nights;
            //if they are a business customer they have to rent 3 tools
            if(pickeCustomer.CustomerType == 3)
            {
                randomInteger = 3;
                nights = 7;
            }
            else
            {
                //add a toolscan rent currently.
                randomInteger = rand.nextInt(pickeCustomer.ToolsCanRentCurrently);
                nights = getRentTime(pickeCustomer.maxNights, pickeCustomer.minNights);
            }
            ArrayList<Tool> Tools = PickTools(randomInteger);
            int accessorys =  rand.nextInt(6);
            int cords =  rand.nextInt(6);
            int gear = rand.nextInt(6);
            Rental NewRental = new Rental(pickeCustomer,Tools, nights, cords, accessorys, gear,this.rentalsSoFar);
            
            this.ActiveRentals.add(NewRental);
            this.AllRentals.add(NewRental);
            this.MoneyToday = this.MoneyToday + NewRental.totalCost;
            this.CheckCustomers();
            this.CheckTools();
            this.rentalsSoFar = this.rentalsSoFar+1;
            return true;
            
        }
        else if (this.ToolsNotRented.size() == 2)
        {
            Collections.shuffle(this.availableCustomers);
            for (Customer item : this.availableCustomers)
            {
                if(item.ToolsCanRentCurrently >= 2 && item.MinTools <= 2)
                {
                    
                    Customer pickeCustomer = this.availableCustomers.get(rand.nextInt(this.availableCustomers.size()));
                    int randomInteger = rand.nextInt(pickeCustomer.ToolsCanRentCurrently);
                    ArrayList<Tool> Tools = PickTools(randomInteger);
                    int nights = getRentTime(pickeCustomer.maxNights, pickeCustomer.minNights);
                    int accessorys =  rand.nextInt(6);
                    int cords =  rand.nextInt(6);
                    int gear = rand.nextInt(6);
                    Rental NewRental = new Rental(pickeCustomer,Tools, nights, cords, accessorys, gear,this.rentalsSoFar);
                    this.ActiveRentals.add(NewRental);
                    this.AllRentals.add(NewRental);
                    this.MoneyToday = this.MoneyToday + NewRental.totalCost;
                    this.rentalsSoFar = this.rentalsSoFar+1;
                    return true;
                }
                
                
            }
            return false;
        }
        else if (this.ToolsNotRented.size() == 1)
        {
            Collections.shuffle(this.availableCustomers);
            for (Customer item : this.availableCustomers)
            {
                if(item.ToolsCanRentCurrently >= 2  && item.MinTools <= 1)
                {
                    
                    Customer pickeCustomer = this.availableCustomers.get(rand.nextInt(this.availableCustomers.size()));
                    int randomInteger = rand.nextInt(pickeCustomer.ToolsCanRentCurrently);
                    ArrayList<Tool> Tools = PickTools(randomInteger);
                    int nights = getRentTime(pickeCustomer.maxNights, pickeCustomer.minNights);
                    int accessorys =  rand.nextInt(6);
                    int cords =  rand.nextInt(6);
                    int gear = rand.nextInt(6);
                    Rental NewRental = new Rental(pickeCustomer,Tools, nights, cords, accessorys, gear,this.rentalsSoFar);
                    this.ActiveRentals.add(NewRental);
                    this.AllRentals.add(NewRental);
                    this.MoneyToday = this.MoneyToday + NewRental.totalCost;
                    this.rentalsSoFar = this.rentalsSoFar+1;
                    return true;
                }
            }
            return false;
        }
        else
        {
            return false;
        }
    }
    public ArrayList<Tool> PickTools(int NumberOfTools)
    {
        Random rand = new Random();
        ArrayList<Tool> ChoosenTools = new ArrayList<>();
        if(NumberOfTools == 3)
        {
            Tool tool1 = this.ToolsNotRented.get(rand.nextInt(this.ToolsNotRented.size()));
            ChoosenTools.add(tool1);
            this.ToolsNotRented.remove(tool1);
            this.ToolsRented.add(tool1);

            Tool tool2 = this.ToolsNotRented.get(rand.nextInt(this.ToolsNotRented.size()));
            ChoosenTools.add(tool2);
            this.ToolsNotRented.remove(tool2);
            this.ToolsRented.add(tool2);

            Tool tool3 = this.ToolsNotRented.get(rand.nextInt(this.ToolsNotRented.size()));
            ChoosenTools.add(tool3);
            this.ToolsNotRented.remove(tool3);
            this.ToolsRented.add(tool3);
        }
        else if (NumberOfTools == 2)
        {
            Tool tool1 = this.ToolsNotRented.get(rand.nextInt(this.ToolsNotRented.size()));
            ChoosenTools.add(tool1);
            this.ToolsNotRented.remove(tool1);
            this.ToolsRented.add(tool1);

            Tool tool2 = this.ToolsNotRented.get(rand.nextInt(this.ToolsNotRented.size()));
            ChoosenTools.add(tool2);
            this.ToolsNotRented.remove(tool2);
            this.ToolsRented.add(tool2);
        }
        else
        {
            Tool tool1 = this.ToolsNotRented.get(rand.nextInt(this.ToolsNotRented.size()));
            ChoosenTools.add(tool1);
            this.ToolsNotRented.remove(tool1);
            this.ToolsRented.add(tool1);
        }
        return ChoosenTools;
    }

    public static void main(String[] args) 
    {
        Store HardWare = new Store();
        while(HardWare.Day < 35)
        {
            HardWare.RunDay();
        }
        HardWare.CloseStore();

    }

}