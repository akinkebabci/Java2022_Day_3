public class CustomerManager {
    private BaseLogger baseLogger;

    public CustomerManager(BaseLogger logger){
        this.baseLogger = logger;
    }
    public void Add(){
        System.out.println("Müşteri Eklendi");
        this.baseLogger.Log("Log Mesajı");

    }
}
