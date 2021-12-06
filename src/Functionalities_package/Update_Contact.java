package Functionalities_package;
import java.util.*;
import Data_package.ContactsData;
import Contact_package.Contact;

public class Update_Contact {

    Patternize_Heading pattern_object = new Patternize_Heading();

    public void update_name()
    {
        Scanner in = new Scanner(System.in);
        String oldname,newname;
        System.out.print("Enter the contact name to update : ");
        oldname = in.nextLine();
        int old_contact_found=0;
        for (Contact cont : ContactsData.contacts_array) {
            if (cont.getName().equalsIgnoreCase(oldname)) {
                System.out.print("Enter the new contact name : ");
                newname = in.nextLine();
                cont.setName(newname);
                old_contact_found = 1;
                System.out.println("Contact Name Updated !!!");
                break;
            }
        }
        if(old_contact_found==0)
            System.out.println("No such contact name found in the contact book");
    }

    public void update_number()
    {
        Scanner in = new Scanner(System.in);
        long old_num,new_num;
        System.out.print("Enter the contact number to update : ");
        old_num = in.nextLong();
        int old_contact_found=0;
        for (Contact cont : ContactsData.contacts_array) {
            if (cont.getTel_num() == old_num) {
                System.out.print("Enter the new contact number : ");
                new_num = in.nextLong();
                cont.setTel_num(new_num);
                old_contact_found = 1;
                System.out.println("Contact Number Updated !!!");
                break;
            }
        }
        if(old_contact_found==0)
            System.out.println("No such contact number found in the contact book");
    }

    public void update_name_number()
    {
        Scanner in = new Scanner(System.in);
        String oldname,newname;
        long old_num,new_num;
        System.out.println("Make sure the name and number you give are of the same person");
        System.out.print("Enter the contact name to update : ");
        oldname = in.nextLine();
        System.out.print("Enter the contact number to update : ");
        old_num = in.nextLong();
        int old_contact_found=0;
        for (Contact cont : ContactsData.contacts_array) {
            if (cont.getTel_num() == old_num && cont.getName().equalsIgnoreCase(oldname)) {
                System.out.print("Enter the new contact name : ");
                newname = in.nextLine();
                cont.setName(newname);
                System.out.print("Enter the new contact number : ");
                new_num = in.nextLong();
                cont.setTel_num(new_num);
                old_contact_found = 1;
                System.out.println("Contact Updated !!!");
                break;
            }
        }
        if(old_contact_found==0)
            System.out.println("No such contact found in the contact book");
    }

    public void updateContact()
    {
        pattern_object.patternizeHeading("UPDATING A CONTACT");
        Scanner in = new Scanner(System.in);
        System.out.println("If you want to update name then enter 1 ");
        System.out.println("If you want to update number then enter 2 ");
        System.out.println("If you want to update both then enter 3 ");
        System.out.print("Enter your choice : ");
        int update_choice;
        update_choice = in.nextInt();

        switch (update_choice) {
            case 1 -> update_name();
            case 2 -> update_number();
            case 3 -> update_name_number();
            default -> System.out.println("Invalid update choice !!!");
        }

    }


}
