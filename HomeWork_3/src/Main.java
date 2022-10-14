import Access.HibernateKodlamaioDao;
import Access.JDBCKodlamaioDao;
import Access.KodlamaioDao;
import Business.KodlamaioManager;
import Core.DataBaseLogger;
import Core.FileLogger;
import Core.Logger;
import entities.Kodlamaio;



public class Main {
    public static void main(String[] args) throws Exception {
        Kodlamaio kodlamaio =new Kodlamaio();
        kodlamaio.setId("22");
        kodlamaio.setInstructorName("Engin Demiroğ");
        kodlamaio.setCourseName(new String[]{"Yazılım Geliştirici Yetiştirme Kampı(JAVA)"});
        kodlamaio.setCategoryName(new String[]{"Programlama","Tasarım"});
        kodlamaio.setPrice(25);
        Logger[] loggers ={new FileLogger(),new DataBaseLogger()};
        KodlamaioDao[] kodlamaioDaos = {new HibernateKodlamaioDao(),new JDBCKodlamaioDao()};
        KodlamaioManager kodlamaioManager = new KodlamaioManager(loggers, kodlamaioDaos);
        kodlamaioManager.add(kodlamaio);






    }
}