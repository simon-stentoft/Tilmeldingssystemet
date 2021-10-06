import java.time.LocalDate;

public class Tilmeldingskatalog {
    String lejrID;
    boolean ugeRegel;
    LocalDate startDato;
    LocalDate slutDato;
    Person deltagere[];

    public Tilmeldingskatalog(String lejrID, boolean ugeRegel, LocalDate startDato, LocalDate slutDato) {
        this.lejrID = lejrID;
        this.ugeRegel = ugeRegel;
        this.startDato = startDato;
        this.slutDato = slutDato;

        deltagere = new Person[5];

        for (int i = 0; i < deltagere.length; i++) {
            deltagere[i] = null;
        }
    }
    public String toString() {
        String result=
                "LejrID: " + lejrID
                        + ", Ugeregel: " + ugeRegel
                        + ", Startdato: " + startDato
                        + ", Slutdato: " + slutDato;
        for(int i = 0; i < deltagere.length; i++)
        {
            if (deltagere[i] != null)
            {
                result = result + deltagere[i].toString() + "\n";
            }
        }
        return result;
    }
}
