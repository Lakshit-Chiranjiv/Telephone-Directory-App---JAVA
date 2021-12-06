package Functionalities_package;
import java.util.*;
import Data_package.ContactsData;
import Contact_package.Contact;

public class Sort_Contacts {

    public void sortContacts()
    {
        if(ContactsData.contacts_array.size() == 0)
            System.out.println("Contact book has no contacts");
        else
        {
            ContactsData.sort_parameter = 1;
            System.out.println("Contacts sorted in alphabetical order Successfully!!!");
        }
    }
}
