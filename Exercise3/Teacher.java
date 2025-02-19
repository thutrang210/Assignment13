package Exercise3;

import java.util.Date;
import java.util.Scanner;

public class Teacher extends Person {

    String department;

    public Teacher() {
    }

    public Teacher(String id, String homeTown, Date dateOfBirth, String department) {
        super(id, homeTown, dateOfBirth);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }

    @Override
    public void addPerson() {
        super.addPerson();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Department: ");
        department = scanner.nextLine();
    }

    @Override
    public boolean editPerson() {
        super.editPerson();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Edit Department: ");
        department = scanner.nextLine();
        return true;
    }
}
