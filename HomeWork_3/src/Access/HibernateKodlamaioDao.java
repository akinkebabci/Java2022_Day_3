package Access;

import entities.Kodlamaio;

public class HibernateKodlamaioDao implements KodlamaioDao{
    @Override
    public void add(Kodlamaio kodlamaio) {
        System.out.println("Hibernate ile Veritabanına Eklendi");
    }
}
