import java.util.HashMap;
import java.util.Map;

public class Maps {
    public Maps() {

    }

    public static void main(String[] args) {
        Person person = new Person();
        person.pesel = 88;
        person.imie = "ZBIGNIEW";
        Map<Integer, Person> mapPerson = new HashMap();
        mapPerson.put(person.pesel, person);
        Person findedPerson = (Person)mapPerson.get(95);
        System.out.println("Znaleziona osoba ma Imie: " + findedPerson.imie + " I Pesel " + findedPerson.pesel);
    }
}
