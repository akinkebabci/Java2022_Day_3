package Core;

public class MailLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("Mail Gönderildi : " + message);

    }
}
