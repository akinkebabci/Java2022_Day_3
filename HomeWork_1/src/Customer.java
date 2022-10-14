public class Customer {
    int Id;
    String  nationalIdentity;

    public Customer(){

    }

    public Customer(int id, String nationalIdentity) {
        Id = id;
        this.nationalIdentity = nationalIdentity;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNationalIdentity() {
        return nationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }
}
