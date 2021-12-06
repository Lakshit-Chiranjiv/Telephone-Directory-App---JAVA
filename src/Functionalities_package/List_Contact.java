package Functionalities_package;
import Data_package.ContactsData;
import java.util.*;
import Contact_package.Contact;

public class List_Contact {

    Patternize_Heading pattern_object = new Patternize_Heading();

    public void listContacts()
    {
        pattern_object.patternizeHeading("Contact List");
        if(ContactsData.sort_parameter == 0)
        {
            for(Contact cont : ContactsData.contacts_array){
                cont.showContact();
                System.out.println();
            }
        }
        else
        {
            for(Contact cont : ContactsData.sorted_contacts_array){
                cont.showContact();
                System.out.println();
            }
        }
        System.out.println("----------------------Contact List Ends-------------------------------");
    }
}
