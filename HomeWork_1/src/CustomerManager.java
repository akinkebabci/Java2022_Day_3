public class CustomerManager {
    private Customer customer;

    public CustomerManager(Customer customer) {
        this.customer = customer;
    }

    public void save(){
        System.out.println("Müşteri Kaydedildi  " );
    }

    public void remove(){
        System.out.println("Müşteri Silindi  " );
    }
}
