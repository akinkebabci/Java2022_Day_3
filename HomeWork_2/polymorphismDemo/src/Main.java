public class Main {
    public static void main(String[] args) {
    /*    BaseLogger[] loggers = new BaseLogger[]{new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoloLogger()};
        for (BaseLogger logger:loggers) {
            logger.Log("Log Mesajı");
        }*/
        CustomerManager customerManager=new CustomerManager(new DatabaseLogger());
        customerManager.Add();
    }
}