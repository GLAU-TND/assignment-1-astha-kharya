package def;

import java.util.LinkedList;

public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private LinkedList<String> ContactNumber;

    public Person(String firstName, String lastName, String email, LinkedList<String> contactNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        ContactNumber = contactNumber;
    }
}
