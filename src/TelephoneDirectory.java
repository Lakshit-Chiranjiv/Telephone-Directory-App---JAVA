import java.util.*;

import Contact_package.Contact;
import Data_package.ContactsData;
import Functionalities_package.*;
public class TelephoneDirectory {

    static Add_Contact add_object = new Add_Contact();
    static Update_Contact update_object = new Update_Contact();
    static List_Contact list_object = new List_Contact();
    static Delete_Contact delete_object = new Delete_Contact();
    static Sort_Unsort_Contacts sort_object = new Sort_Unsort_Contacts();
    static Search_Contact search_object = new Search_Contact();
    static Clear_Contacts clear_object = new Clear_Contacts();
    static Print_Menu menu_object = new Print_Menu();
    static Patternize_Heading pattern_object = new Patternize_Heading();


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ContactsData.contacts_array.add(new Contact("harry",8788));
        ContactsData.contacts_array.add(new Contact("bunny",878868));
        ContactsData.contacts_array.add(new Contact("john",874244));
        ContactsData.contacts_array.add(new Contact("sherlock",872388));
        ContactsData.contacts_array.add(new Contact("lestrade",8123788));

        int ask_menu = 1;
        int choice;

        while (ask_menu==1)
        {
            menu_object.printMenu();
            System.out.print("Enter your choice : ");
            choice = in.nextInt();

            switch (choice) {
                case 1 -> add_object.addContact();
                case 2 -> update_object.updateContact();
                case 3 -> list_object.listContacts();
                case 4 -> delete_object.deleteContact();
                case 5 -> sort_object.sortContacts();
                case 6 -> search_object.searchContact();
                case 7 -> clear_object.clearContacts();
                case 8 -> ask_menu = 0;
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
