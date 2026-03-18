import java.util.*;

class Contact {
    String name;
    String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public void displayContact() {
        System.out.println("Name  : " + name);
        System.out.println("Phone : " + phone);
        System.out.println("-------------------");
    }
}

public class Contactbook {

    private static List<Contact> contacts = new ArrayList<>();

    public static void addContact(String name, String phone) {
        Contact newContact = new Contact(name, phone);
        contacts.add(newContact);
        System.out.println("Contact added successfully.");
    }

    public static void displayAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts to display.");
        } else {
            for (Contact c : contacts) {
                c.displayContact();
            }
        }
    }

    public static void searchContact(String name) {
        for (Contact c : contacts) {
            if (c.name.equalsIgnoreCase(name)) {
                c.displayContact();
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nContact Book Menu:");
            System.out.println("1. Add New Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Search Contact by Name");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();

                    addContact(name, phone);
                    break;

                case 2:
                    displayAllContacts();
                    break;

                case 3:
                    System.out.print("Enter Name to Search: ");
                    String searchName = sc.nextLine();
                    searchContact(searchName);
                    break;

                case 4:
                    System.out.println("Exiting Contact Book...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
