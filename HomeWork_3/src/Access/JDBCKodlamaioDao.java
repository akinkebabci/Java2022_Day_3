package Access;

import entities.Kodlamaio;

public class JDBCKodlamaioDao implements KodlamaioDao {
    @Override
    public void add(Kodlamaio kodlamaio) {
        System.out.println("JDBC ile Veri Tabanına Eklendi");
    }
}
