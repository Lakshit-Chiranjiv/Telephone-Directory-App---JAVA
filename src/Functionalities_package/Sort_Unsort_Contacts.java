package Functionalities_package;
import Data_package.ContactsData;


public class Sort_Unsort_Contacts {

    public void sortContacts()
    {
        if(ContactsData.contacts_array.size() == 0)
            System.out.println("Contact book has no contacts");
        else
        {
            if(ContactsData.sort_parameter==0)
            {
                ContactsData.sort_parameter = 1;
                System.out.println("Contacts Successfully sorted in alphabetical order!!!");
            }
            else
            {
                ContactsData.sort_parameter = 0;
                System.out.println("Contacts Successfully unsorted as they were previously entered!!!");
            }

        }
    }
}
