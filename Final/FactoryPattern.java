public class FactoryPattern {
    public static Customer getCustomer(String type) {
        if (type.equals("Business1"))
        {
            return new BusinessCustomer("buisnessCustomer1");
        }
        else if (type.equals("Business2"))
        {
            return new BusinessCustomer("buisnessCustomer2");
        }
        else if (type.equals("Business3"))
        {
            return new BusinessCustomer("buisnessCustomer3");
        }
        else if (type.equals("Business4"))
        {
            return new BusinessCustomer("buisnessCustomer4");
        }
        
        else if (type.equals("Casual1"))
        {
            return new CasualCustomer("casualCustomer1");
        }
        else if (type.equals("Casual2"))
        {
            return new CasualCustomer("casualCustomer2");
        }
        else if (type.equals("Casual3"))
        {
            return new CasualCustomer("casualCustomer3");
        }
        else if (type.equals("Casual4"))
        {
            return new CasualCustomer("casualCustomer4");
        }
        
        else if (type.equals("Regular1"))
        {
            return new RegularCustomer("regularCustomer1");
        }
        else if (type.equals("Regular2"))
        {
            return new RegularCustomer("regularCustomer2");
        }
        else if (type.equals("Regular3"))
        {
            return new RegularCustomer("regularCustomer3");
        }
        else if (type.equals("Regular4"))
        {
            return new RegularCustomer("regularCustomer4");
        }
        return null;
    }
}