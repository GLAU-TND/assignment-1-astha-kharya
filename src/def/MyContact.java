package def;

import ADT.MyCon;

import java.util.Scanner;

public class MyContact implements MyCon {
    Scanner sc = new Scanner(System.in);

    private String getFirstName() {
        System.out.println("Please Enter The Name Of The Person ");
        System.out.println("FirstName: ");
        String firstName = sc.next();
        return firstName;
    }

    private String getLastName() {
        System.out.println("LastName: ");
        String lastName = sc.next();
        return lastName;
    }

    @Override
    public void addContact() {

    }

    @Override
    public void viewContact() {

    }

    @Override
    public void deleteContact() {

    }

    @Override
    public void searchContact() {

    }
}
