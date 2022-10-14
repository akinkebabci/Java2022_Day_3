public class Main {
    public static void main(String[] args) {
        CustomerMenager customerMenager = new CustomerMenager(new MySqlCustomerDal());



        customerMenager.add();

    }
}