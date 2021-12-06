import java.util.*;
import Contact_package.Contact;
import Functionalities_package.*;
public class TB {

    static Add_Contact add_object = new Add_Contact();
    static Update_Contact update_object = new Update_Contact();
    static List_Contact list_object = new List_Contact();
    static Delete_Contact delete_object = new Delete_Contact();
    static Sort_Contacts sort_object = new Sort_Contacts();
    static Patternize_Heading pattern_object = new Patternize_Heading();


//    public static void patternizeHeading(String str)
//    {
//        System.out.println("\n\n----------------------------------------------------");
//        System.out.println("                  "+str.toUpperCase());
//        System.out.println("----------------------------------------------------\n\n");
//    }

    public static void printMenu()
    {
        System.out.println("Enter a number from 1 - 7 as per the requirement :-");
        pattern_object.patternizeHeading("CHOICE MENU");
        System.out.println("Enter :-");
        System.out.println("1 for Adding a contact");
        System.out.println("2 for Updating a contact");
        System.out.println("3 for Listing down all the contacts");
        System.out.println("4 for Deleting a contact");
        System.out.println("5 for Sorting the contacts alphabetically");
        System.out.println("6 for Searching a contact");
        System.out.println("7 for Closing the contact-book");
    }

//    public static void addContact()
//    {
//        patternizeHeading("ADDING A CONTACT");
//        Scanner in = new Scanner(System.in);
//        String name;
//        long tele_number;
//        int already_exists = 0;
//        System.out.print("Enter contact name : ");
//        name = in.nextLine();
//        for (Contact cont : contacts_array)
//        {
//            if(cont.getName().equalsIgnoreCase(name)) {
//                System.out.println("Contact with this name already exists");
//                already_exists = 1;
//                break;
//            }
//        }
//        System.out.print("Enter contact number : ");
//        tele_number = in.nextLong();
//        for (Contact cont : contacts_array)
//        {
//            if(cont.getTel_num() == tele_number) {
//                System.out.println("Contact with this number already exists");
//                already_exists = 1;
//                break;
//            }
//        }
//
//        if(already_exists == 0)
//        {
//            Contact newContact = new Contact(name,tele_number);
//            contacts_array.add(newContact);
//            System.out.println("New Contact Added!!");
//        }
//        else
//            System.out.println("Contact could not be added!!");
//    }

//    public static void update_name()
//    {
//        Scanner in = new Scanner(System.in);
//        String oldname,newname;
//        System.out.print("Enter the contact name to update : ");
//        oldname = in.nextLine();
//        int old_contact_found=0;
//        for (Contact cont : contacts_array) {
//            if (cont.getName().equalsIgnoreCase(oldname)) {
//                System.out.print("Enter the new contact name : ");
//                newname = in.nextLine();
//                cont.setName(newname);
//                old_contact_found = 1;
//                System.out.println("Contact Name Updated !!!");
//                break;
//            }
//        }
//        if(old_contact_found==0)
//            System.out.println("No such contact name found in the contact book");
//    }
//
//    public static void update_number()
//    {
//        Scanner in = new Scanner(System.in);
//        long old_num,new_num;
//        System.out.print("Enter the contact number to update : ");
//        old_num = in.nextLong();
//        int old_contact_found=0;
//        for (Contact cont : contacts_array) {
//            if (cont.getTel_num() == old_num) {
//                System.out.print("Enter the new contact number : ");
//                new_num = in.nextLong();
//                cont.setTel_num(new_num);
//                old_contact_found = 1;
//                System.out.println("Contact Number Updated !!!");
//                break;
//            }
//        }
//        if(old_contact_found==0)
//            System.out.println("No such contact number found in the contact book");
//    }
//
//    public static void update_name_number()
//    {
//        Scanner in = new Scanner(System.in);
//        String oldname,newname;
//        long old_num,new_num;
//        System.out.println("Make sure the name and number you give are of the same person");
//        System.out.print("Enter the contact name to update : ");
//        oldname = in.nextLine();
//        System.out.print("Enter the contact number to update : ");
//        old_num = in.nextLong();
//        int old_contact_found=0;
//        for (Contact cont : contacts_array) {
//            if (cont.getTel_num() == old_num && cont.getName().equalsIgnoreCase(oldname)) {
//                System.out.print("Enter the new contact name : ");
//                newname = in.nextLine();
//                cont.setName(newname);
//                System.out.print("Enter the new contact number : ");
//                new_num = in.nextLong();
//                cont.setTel_num(new_num);
//                old_contact_found = 1;
//                System.out.println("Contact Updated !!!");
//                break;
//            }
//        }
//        if(old_contact_found==0)
//            System.out.println("No such contact found in the contact book");
//    }
//
//    public static void updateContact()
//    {
//        patternizeHeading("UPDATING A CONTACT");
//        Scanner in = new Scanner(System.in);
//        System.out.println("If you want to update name then enter 1 ");
//        System.out.println("If you want to update number then enter 2 ");
//        System.out.println("If you want to update both then enter 3 ");
//        System.out.print("Enter your choice : ");
//        int update_choice;
//        update_choice = in.nextInt();
//
//        switch (update_choice) {
//            case 1 -> update_name();
//            case 2 -> update_number();
//            case 3 -> update_name_number();
//            default -> System.out.println("Invalid update choice !!!");
//        }
//
//    }
//
//    public static void listContacts()
//    {
//        patternizeHeading("Contact List");
//        if(sort_parameter == 0)
//        {
//            for(Contact cont : contacts_array){
//                cont.showContact();
//                System.out.println();
//            }
//        }
//        else
//        {
//            for(Contact cont : sorted_contacts_array){
//                cont.showContact();
//                System.out.println();
//            }
//        }
//        System.out.println("----------------------Contact List Ends-------------------------------");
//    }

//    public static void deleteContact()
//    {
//        patternizeHeading("DELETING A CONTACT");
//        Scanner in = new Scanner(System.in);
//        String name_to_delete;
//        int contact_found = 0;
//        System.out.print("Enter contact name to delete : ");
//        name_to_delete = in.nextLine();
//        for (int i=0;i<contacts_array.size();i++)
//        {
//            if(contacts_array.get(i).getName().equalsIgnoreCase(name_to_delete)) {
//                contacts_array.remove(i);
//                System.out.println("Contact Deleted Successfully !!!");
//                contact_found = 1;
//                break;
//            }
//        }
//        if(contact_found == 0)
//            System.out.println("No such contact found in the contact book");
//    }

//    public static void sortContacts()
//    {
//        if(contacts_array.size() == 0)
//            System.out.println("Contact book has no contacts");
//        else
//        {
//            sort_parameter = 1;
//            System.out.println("Contacts sorted in alphabetical order Successfully!!!");
//        }
//    }

    public static void searchContact()
    {

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

            switch (choice) {
                case 1 -> add_object.addContact();
                case 2 -> update_object.updateContact();
                case 3 -> list_object.listContacts();
                case 4 -> delete_object.deleteContact();
                case 5 -> sort_object.sortContacts();
                case 6 -> searchContact();
                case 7 -> ask_menu = 0;
            }

            if(ask_menu==0)
            {
                pattern_object.patternizeHeading("Closing Contact Book");
                break;
            }
            System.out.print("Do you want to continue? Enter 1 for YES or 0 for NO : ");
            ask_menu=in.nextInt();
            if(ask_menu==0)
                pattern_object.patternizeHeading("Closing Contact Book");
        }
    }
}
