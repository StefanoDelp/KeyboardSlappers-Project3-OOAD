class NoCustomers extends Observer {
    
    public NoCustomers(Store store) {
        this.store = store;
        this.store.add(this);
    }

    public void update() {
        System.out.println("There is no new rentals today. Customers today are returning tools or doing nothing but looking around.");
    }
}