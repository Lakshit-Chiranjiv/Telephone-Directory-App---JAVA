package Functionalities_package;
import java.util.*;
import Data_package.ContactsData;
import Contact_package.Contact;


public class Search_Contact {

    Patternize_Heading pattern_object = new Patternize_Heading();

    public void searchContact()
    {
        pattern_object.patternizeHeading("SEARCHING A CONTACT");
        Scanner in = new Scanner(System.in);
        String search_term;
        int contact_found = 0,less_length;
        System.out.print("Enter contact name or number to search : ");
        search_term = in.nextLine();
        ArrayList<Contact> search_related = new ArrayList<>();
        if(Character.isLetter(search_term.trim().charAt(0)))
        {
            for(Contact cont : ContactsData.contacts_array)
            {
                if(cont.getName().equalsIgnoreCase(search_term))
                {
                    contact_found = 1;
                    System.out.println("CONTACT FOUND");
                    cont.showContact();
                    break;
                }
                less_length = Math.min(cont.getName().length(),search_term.length());
                if(cont.getName().length()>=search_term.length())
                {
                    if(search_term.equalsIgnoreCase(cont.getName().substring(0, less_length)))
                        search_related.add(cont);
                }
                else
                {
                    if(search_term.substring(0, less_length).equalsIgnoreCase(cont.getName()))
                        search_related.add(cont);
                }
            }
            if(contact_found==0)
                System.out.println("THERE IS NO SUCH CONTACT");

            pattern_object.patternizeHeading("SOME RELATED CONTACTS");
            if(search_related.size() == 0)
                System.out.println("THERE ARE NO SEARCH RELATED CONTACTS");
            else
            {
                for (Contact cont : search_related)
                {
                    cont.showContact();
                    System.out.println();
                }
            }

        }
        else
        {
            for(Contact cont : ContactsData.contacts_array)
            {
                if(String.valueOf(cont.getTel_num()).equalsIgnoreCase(search_term))
                {
                    contact_found = 1;
                    System.out.println("CONTACT FOUND");
                    cont.showContact();
                    break;
                }
                less_length = Math.min(String.valueOf(cont.getTel_num()).length(),search_term.length());
                if(String.valueOf(cont.getTel_num()).length()>=search_term.length())
                {
                    if(search_term.equalsIgnoreCase(String.valueOf(cont.getTel_num()).substring(0, less_length)))
                        search_related.add(cont);
                }
                else
                {
                    if(search_term.substring(0, less_length).equalsIgnoreCase(String.valueOf(cont.getTel_num())))
                        search_related.add(cont);
                }
            }
            if(contact_found==0)
                System.out.println("THERE IS NO SUCH CONTACT");

            pattern_object.patternizeHeading("SOME RELATED CONTACTS");
            if(search_related.size() == 0)
                System.out.println("THERE ARE NO SEARCH RELATED CONTACTS");
            else
            {
                for (Contact cont : search_related)
                {
                    cont.showContact();
                    System.out.println();
                }
            }
        }
    }

}
