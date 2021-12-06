package Functionalities_package;
import java.util.*;
import Data_package.ContactsData;
import Contact_package.Contact;

public class Add_Contact {

    Patternize_Heading pattern_object = new Patternize_Heading();


    public void addContact()
    {
        pattern_object.patternizeHeading("ADDING A CONTACT");
        Scanner in = new Scanner(System.in);
        String name;
        long tele_number;
        int already_exists = 0;
        System.out.print("Enter contact name : ");
        name = in.nextLine();
        for (Contact cont : ContactsData.contacts_array)
        {
            if(cont.getName().equalsIgnoreCase(name)) {
                System.out.println("Contact with this name already exists");
                already_exists = 1;
                break;
            }
        }
        System.out.print("Enter contact number : ");
        tele_number = in.nextLong();
        for (Contact cont : ContactsData.contacts_array)
        {
            if(cont.getTel_num() == tele_number) {
                System.out.println("Contact with this number already exists");
                already_exists = 1;
                break;
            }
        }

        if(already_exists == 0)
        {
            Contact newContact = new Contact(name,tele_number);
            ContactsData.contacts_array.add(newContact);
            System.out.println("New Contact Added!!");
        }
        else
            System.out.println("Contact could not be added!!");
    }

}
