package Contact_package;

public class Contact {
    int index;
    String name;
    long tel_num;

    public Contact()
    {
        this.name = "Anonymous-Contact_package.Contact";
        this.tel_num = 0;
    }

    public Contact(String name,long tel_num)
    {
        this.name = name;
        this.tel_num = tel_num;
    }

    public void showContact()
    {
        System.out.println("Contact Name : "+name+"   Contact Number : "+tel_num);
    }

}
