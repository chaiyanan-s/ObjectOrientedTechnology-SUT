package lab;

import java.util.Scanner;

public class Person implements UserToolBox{
    private String fullName;
    private String firstName;
    private String middleName;
    private String lastName;
    private Email email;

    public Person() {
    }

    public Person(String fullName, Email email) {
        this.fullName = fullName;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public Email getEmail() {
        return email;
    }

    @Override
    public void getInfo(){}
    @Override
    public void setNameOfUser(String fullName) {
        firstName = fullName.split(" ")[0];
        middleName = fullName.split(" ")[1];
        lastName = fullName.split(" ")[2];
    }
    public void  verifyUser(Scanner sc) {
        setNameOfUser(fullName);
        System.out.print("Enter the password of \"" + email.getEmailAddress() + "\": ");

        String passwordIn = sc.nextLine();

        if(!passwordIn.equals(email.getPassword())) {
            System.out.println("You don't have permission to access the account data!");
        } else {
            System.out.println("Full name: " + fullName);
            System.out.println("First name: " + firstName);
            System.out.println("Middle name: " + middleName);
            System.out.println("Last name: " + lastName);
            email.getInfo();
        }
    }
}
