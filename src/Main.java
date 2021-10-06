import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person(1,"Lau","Popvej 13","Nat patrulje", LocalDate.of(2010,10,12),true);

        System.out.println(person1);

        Person person2 = new Person(2,"Ken","Adelvej 66","Nat patrulje",LocalDate.of(2008,6,4),true);
    }
}
