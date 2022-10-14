public class Person extends Customer {
    String nationalIndentity;

    public Person() {

    }

    public Person(String nationalIndentity) {
        this.nationalIndentity = nationalIndentity;
    }

    public String getNationalIndentity() {
        return nationalIndentity;
    }

    public void setNationalIndentity(String nationalIndentity) {
        this.nationalIndentity = nationalIndentity;
    }
}

