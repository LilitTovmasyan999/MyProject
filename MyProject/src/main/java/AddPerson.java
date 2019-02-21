import java.util.ArrayList;
import java.util.List;

public class AddPerson {
    public static List<Person> personList = new ArrayList<>();


    public static List<Person> add() {
        personList.add(new Person("A", "A", "123"));
        personList.add(new Person("B", "B", "456"));
        return personList;
    }
    public static void addNewPerson(String name, String lname, String address) {
        personList.add(new Person(name, lname, address));
    }
}
