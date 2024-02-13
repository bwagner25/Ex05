import java.util.*;

public class ContactBook {
    Map<String,String> contacts = new HashMap<>();

    public void addContact(Person a){
        contacts.put(a.getName(),a.getEmail());
    }
    public void findEmail(String a){
        if(contacts.containsKey(a)){
            System.out.println(a + "'s email is " + contacts.get(a));
        } else {
            System.out.println("That name isn't in the contact book");
        }
    }
}
