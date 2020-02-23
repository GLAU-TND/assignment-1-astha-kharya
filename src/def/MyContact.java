package def;

import ADT.MyCon;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MyContact implements MyCon {
    Scanner sc = new Scanner(System.in);
    MyLinked<Person> MyContactBook = new MyLinked<>();
    MyLinked<String> contactNumbers = new MyLinked<>();

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

    private MyLinked<String> GetContactNumbers() {
        MyLinked<String> contactNumbers = new MyLinked<>();
        System.out.println("ContactNumbers: ");
        String contactNo = sc.next();
        while (true) {
            if (Pattern.matches("[0-9] + ", contactNo)) {
                contactNumbers.add(contactNo);
                break;
            } else {
                System.out.println("Invalid PhoneNumber");
                break;
            }
        }
        while (true) {

            System.out.println("Do you want to add a new ContactNumber? (y/n) : ");
            String a = sc.next();
            char at = a.charAt(0);
            if (a.length() > 1) {
                System.out.println("Please Enter a valid input i.e.,y(lowerCase) for Yes or n(lowerCase for NO)");
                continue;
            }
            if (at == 'y') {
                System.out.println("Contact Number: ");
                contactNo = sc.next();
                if (Pattern.matches("[0-9]+ ", contactNo)) {
                    contactNumbers.add(contactNo);
                } else {
                    System.out.println("Invalid PhoneNumber");
                }
            } else if (at == 'n') {
                break;
            } else {
                System.out.println("Please Enter a valid input i.e.,y(lowerCase) for Yes or n(lowerCase for NO)");
            }
        }
        return contactNumbers;
    }

    private String getEmail() {
        String Email = null;
        while (true) {
            System.out.println("Do you want to add an Email ? (y/n) :");
            String s = sc.next();
            char at = s.charAt(0);
            if (s.length() > 1) {
                System.out.println("Please Enter a valid input i.e.,y(lowerCase) for Yes or n(lowerCase for NO)");
                continue;
            }
            if (at == 'y') {
                System.out.println("Email Address: ");
                Email = sc.next();
            } else if (at == 'n') {
                break;
            } else {
                System.out.println("Please Enter Valid Input i.e., y(lowecase) for Yes or n(lowercase) for NO");
            }
        }
        return Email;
    }

    private int compareFirstName(String fName) {
        int index = 0;
        if (MyContactBook.size == 0) {
        } else {
            for (int i = 0; i < MyContactBook.size; i++) {
                Person temp = MyContactBook.getData(i);
                String name = temp.getFirstName();
                name = name.toLowerCase();
                fName = fName.toLowerCase();
                if (name.compareTo(fName) < 0) {
                    index++;
                } else if (name.compareTo(fName) == 0) {
                    return index;

                } else {
                    break;
                }

            }

        }
        return index;
    }
    @Override
    public void addContact() {
        System.out.println("You have chosen to add a new contact:");
        String firstname = getFirstName();
        String lastname = getLastName();
        contactNumbers = GetContactNumbers();
        String Email = getEmail();
        Person newContact;
        newContact = new Person(firstname, lastname, Email, contactNumbers);
        int index = compareFirstName(firstname);
        MyContactBook.add(newContact, index);
        System.out.println("Contact Added SucessFully");
        System.out.println();
        System.out.println();


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
