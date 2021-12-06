package Functionalities_package;
import java.util.*;
import Data_package.ContactsData;

public class Clear_Contacts {

    Patternize_Heading pattern_object = new Patternize_Heading();

    public void clearContacts()
    {
        pattern_object.patternizeHeading("Clearing contacts");
        Scanner in = new Scanner(System.in);
        System.out.println("Are you sure,you want to clear the contacts?");
        System.out.println("enter 1 for yes, 0 for no : ");
        int clear_choice = in.nextInt();
        if(clear_choice==1)
        {
            System.out.println("You can still get back your contacts if you cleared them by mistake");
            System.out.println("Enter 1 to retrieve your contacts, 0 to permanently delete them : ");
            int retrieve_choice = in.nextInt();
            if(retrieve_choice == 1)
            {
                System.out.println("ALL CONTACTS ARE RETRIEVED!!");
            }
            else
            {
                System.out.println("ALL CONTACTS ARE PERMANENTLY DELETED!!!");
                ContactsData.contacts_array.clear();
            }
        }
    }
}
