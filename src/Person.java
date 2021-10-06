import java.time.LocalDate;

public class Person {
    int id;
    String navn;
    String adresse;
    String patrulje;
    LocalDate fødselsDato;
    boolean enUge;

    public Person(int id, String navn, String adresse, String patrulje, LocalDate fødselsDato, boolean enUge) {
        this.id = id;
        this.navn = navn;
        this.adresse = adresse;
        this.patrulje = patrulje;
        this.fødselsDato = fødselsDato;
        this.enUge = enUge;
    }

    public String toString() {
        return "id: "+id+"\nnavn: "+navn+"\nadresse: "+adresse+"\npatrulje: "+patrulje+"\nfødselsdato: "+fødselsDato+"\nen uges ophold?: "+enUge;
    }
}
