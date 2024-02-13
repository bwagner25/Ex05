import java.util.*;
public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Person person1 = new Person("John", "john@gmail.com");
        Person person2 = new Person("Bob","bob@gmail.com");
        Person person3 = new Person("Samantha","samantha@gmail.com");
        Person person4 = new Person("Roger","roger@gmail.com");
        ContactBook contactBook = new ContactBook();
        contactBook.addContact(person1);
        contactBook.addContact(person2);
        contactBook.addContact(person3);
        contactBook.addContact(person4);

        System.out.println("Who's email to you want to search for?");
        String search = input.nextLine();
        while(!(search.equals("quit"))){
            contactBook.findEmail(search);
            System.out.println("Who's email to you want to search for?");
            search = input.nextLine();
        }
    }
}