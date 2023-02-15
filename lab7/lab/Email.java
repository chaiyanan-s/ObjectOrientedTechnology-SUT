package lab;

import java.lang.*;
public class Email implements ToolBox{
    private String emailAddress;
    private String localPart;
    private String domainName;
    private String password;

    public Email() {
    }

    public Email(String emailAddress, String password) {
        this.emailAddress = emailAddress;
        this.password = password;
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
        localPart = emailAddress.split("@")[0];
        domainName = emailAddress.split("@")[1];
    }
    @Override
    public void getInfo() {
        setEmailPart(emailAddress);
        System.out.println("Email: " + emailAddress);
        System.out.println("Local part: " + localPart);
        System.out.println("Domain name: " + domainName);
    }
}
