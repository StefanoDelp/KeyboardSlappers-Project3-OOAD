public class CustomerStore
{
  private CustomerFactory factory;

  public CustomerStore(CustomerFactory factory)
  {
    this.factory = factory
  }

  public Customer orderCustomer()
  {
    Customer customer = factory.createCustomers();

    customer.RentTool();
    customer.ReturnTools();
    customer.checkIfCanRent();
  }

}
