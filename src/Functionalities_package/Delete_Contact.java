package Functionalities_package;
import java.util.*;
import Data_package.ContactsData;
import Contact_package.Contact;


public class Delete_Contact {

    Patternize_Heading pattern_object = new Patternize_Heading();

    public void deleteContact()
    {
        pattern_object.patternizeHeading("DELETING A CONTACT");
        Scanner in = new Scanner(System.in);
        String name_to_delete;
        int contact_found = 0;
        System.out.print("Enter contact name to delete : ");
        name_to_delete = in.nextLine();
        for (int i=0;i<ContactsData.contacts_array.size();i++)
        {
            if(ContactsData.contacts_array.get(i).getName().equalsIgnoreCase(name_to_delete)) {
                ContactsData.contacts_array.remove(i);
                System.out.println("Contact Deleted Successfully !!!");
                contact_found = 1;
                break;
            }
        }
        if(contact_found == 0)
            System.out.println("No such contact found in the contact book");
    }
}
