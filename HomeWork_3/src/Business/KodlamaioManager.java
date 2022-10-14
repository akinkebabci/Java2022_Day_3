package Business;

import Access.KodlamaioDao;
import Core.Logger;
import entities.Kodlamaio;

public class KodlamaioManager {
    private Logger[] logger;
    private KodlamaioDao[] kodlamaioDao;

    public KodlamaioManager(Logger[] loggers, KodlamaioDao[] kodlamaioDao){
        this.logger = loggers;
        this.kodlamaioDao = kodlamaioDao;
    }
    public void add(Kodlamaio kodlamaio)  {
        for (KodlamaioDao kodlamaioDaos:kodlamaioDao) {
            kodlamaioDaos.add(kodlamaio );
        }

        for (Logger loggers:logger){
            loggers.log("log mesajı");
        }



    }
}
