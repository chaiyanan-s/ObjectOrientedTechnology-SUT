package lab2;

import java.lang.*;
public class Email implements ToolBox{
    private String emailAddress;
    private String localPart;
    private String domainName;
    private String password;
    private String firstName;
    private String lastName;
    private String company;

    public Email() {
    }

    public Email(String firstName, String lastName, String company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getLocalPart() {
        return localPart;
    }

    public String getDomainName() {
        return domainName;
    }

    public String getPassword() {
        return password;
    }

    public void setEmailPart(String emailAddress) {
        localPart = firstName.concat(".".concat(String.valueOf(lastName.charAt(0)))).toLowerCase();
        domainName = company.concat(".com");
    }
    @Override
    public void getInfo() {
        setEmailPart(emailAddress);
        emailAddress = localPart.concat("@".concat(domainName));
        System.out.println("Email: " + emailAddress);
        System.out.println("Local part: " + localPart);
        System.out.println("Domain name: " + domainName);
    }
}
