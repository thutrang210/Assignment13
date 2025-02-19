package Exercise4;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Exercise3.PersonList personList = new Exercise3.PersonList();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu:"
                    + "\n0. Exit"
                    + "\n1. Add Student"
                    + "\n2. Add Teacher"
                    + "\n3. Display All"
                    + "\n4. Edit Person by ID"
                    + "\n5. Delete Person by ID"
                    + "\nYour choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 ->  {
                    Exercise3.Student student = new Exercise3.Student();
                    student.addPerson();
                    personList.addPerson(student);
                }
                case 2 ->  {
                    Exercise3.Teacher teacher = new Exercise3.Teacher();
                    teacher.addPerson();
                    personList.addPerson(teacher);
                }
                case 3 ->  {
                    personList.displayAll();
                }
                case 4 ->  {
                    System.out.print("Enter ID to edit: ");
                    String editId = scanner.nextLine();
                    personList.editPersonById(editId);
                }
                case 5 ->  {
                    System.out.print("Enter ID to delete: ");
                    String deleteId = scanner.nextLine();
                    personList.deletePersonById(deleteId);
                }
                default -> {
                    System.out.println("Try again!");
                }
            }
        } while (choice != 0);
        scanner.close();
    }
}
