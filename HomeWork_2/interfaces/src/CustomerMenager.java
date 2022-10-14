public class CustomerMenager {
    private ICustomerDal customerDal;
    public CustomerMenager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }
    public void add(){
        //İş kodları Yazılan yer
        customerDal.add();

    }
}
