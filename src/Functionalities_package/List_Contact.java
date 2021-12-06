package Functionalities_package;
import Data_package.ContactsData;
import java.util.*;
import Contact_package.Contact;

class NameComparator implements Comparator<Contact> {

    public int compare(Contact s1, Contact s2)
    {
        return s1.getName().compareTo(s2.getName());
    }
}

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
            System.out.println("Contacts are sorted\n");
            ArrayList<Contact> sorted_contacts_array = new ArrayList<>(ContactsData.contacts_array);
            sorted_contacts_array.sort(new NameComparator());
            for(Contact cont : sorted_contacts_array){
                cont.showContact();
                System.out.println();
            }
        }
        System.out.println("----------------------Contact List Ends-------------------------------");
    }
}
