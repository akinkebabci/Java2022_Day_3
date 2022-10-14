package Core;

public class DataBaseLogger implements Logger{

    @Override
    public void log(String message) {
        System.out.println("Veri Tabanına Loglama İşlemi Tamamlandı : " + message);
    }
}
