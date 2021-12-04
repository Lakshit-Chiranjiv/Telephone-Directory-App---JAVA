import java.util.*;
import Contact_package.Contact;
public class TelephoneBook{

    static ArrayList<Contact> contacts_array = new ArrayList<>();
    static ArrayList<Contact> sorted_contacts_array = new ArrayList<>();

    public static void patternizeHeading(String str)
    {
        System.out.println("\n----------------------------------------------------");
        System.out.println("                  "+str.toUpperCase());
        System.out.println("----------------------------------------------------\n\n");
    }

    public static void printMenu()
    {
        System.out.println("Enter a number from 1 - 7 as per the requirement :-");
        patternizeHeading("CHOICE MENU");
        System.out.println("Enter :-");
        System.out.println("1 for Adding a contact");
        System.out.println("2 for Updating a contact");
        System.out.println("3 for Listing down all the contacts");
        System.out.println("4 for Deleting a contact");
        System.out.println("5 for Sorting the contacts alphabetically");
        System.out.println("6 for Searching a contact");
        System.out.println("7 for Closing the contact-book");
    }

    public static void addContact()
    {
        Scanner in = new Scanner(System.in);
        String name;
        long tele_number;
        System.out.print("Enter contact name : ");
        name = in.nextLine();
        System.out.print("Enter contact number : ");
        tele_number = in.nextLong();

        Contact newContact = new Contact(name,tele_number);
        contacts_array.add(newContact);
        System.out.println("New Contact Added!!");
    }




    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ask_menu = 1;
        int choice;

        while (ask_menu==1)
        {
            printMenu();
            System.out.print("Enter your choice : ");
            choice = in.nextInt();

            switch (choice)
            {
                case 1:
                    addContact();
                    break;

                case 2:

            }

            if(ask_menu==0)
                break;
            System.out.println("Do you want to continue? Enter 1 for YES or 0 for NO : ");
            ask_menu=in.nextInt();
        }
    }
}