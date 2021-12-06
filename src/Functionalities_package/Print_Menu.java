package Functionalities_package;

public class Print_Menu {

    Patternize_Heading pattern_object = new Patternize_Heading();
    public void printMenu()
    {
        System.out.println("Enter a number from 1 - 7 as per the requirement :-");
        pattern_object.patternizeHeading("CHOICE MENU");
        System.out.println("Enter :-");
        System.out.println("1 for Adding a contact");
        System.out.println("2 for Updating a contact");
        System.out.println("3 for Listing down all the contacts");
        System.out.println("4 for Deleting a contact");
        System.out.println("5 for Sorting the contacts alphabetically");
        System.out.println("6 for Searching a contact");
        System.out.println("7 for Clearing your contact book");
        System.out.println("8 for Closing the contact-book");
    }
}
