package Contact_package;

public class Contact {
    int index;
    String name;
    long tel_num;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTel_num() {
        return tel_num;
    }

    public void setTel_num(long tel_num) {
        this.tel_num = tel_num;
    }

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
