package Exercise3;

import java.util.ArrayList;

public class PersonList {

    ArrayList<Person> people = new ArrayList<>();

    public void addPerson(Person person) {
        people.add(person);
        System.out.println("Added successfully!");
    }

    public boolean deletePersonById(String id) {
        for (Person object : people) {
            if (object.id.equals(id)) {
                people.remove(object);
                System.out.println("Deleted successfully");
                return true;
            }
        }
        System.out.println("N/A");
        return false;
    }

    public void editPersonById(String id) {
        for (Person object : people) {
            if (object.id.equals(id)) {
                object.editPerson();
                System.out.println("Edited successfully!");
                return;
            }
        }
        System.out.println("N/a");
    }

    public void displayAll() {
        for (Person object : people) {
            object.displayInfo();
        }
    }
}

