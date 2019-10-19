public class CustomerFactory {
  public Customer createCustomers{
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
}
