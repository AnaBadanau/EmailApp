package EmailApp;

import java.util.Locale;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int emailboxCapacity = 500;
    private int defaultPasswordLenght = 10;
    private String alternativeEmail;
    private String companySuffix = "company.com";

    // Constructor to receive the first and last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
    // Call a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department:" + this.department);

        // call a method that returns a random password
        this.password = randomPassword(defaultPasswordLenght);
        System.out.println ("Your password id" + this.password);

        //Combine elements to generate
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("Your email is:" + email);
    }



    //  Ask for department

    private  String setDepartment() {
        System.out.print("Department codes/n1 for sale/n2 for development/n3 for accounting/n0 for none/n enter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "dev";
        } else if (depChoice == 3) {
            return "acct";
        } else {
            return "";
        }
    }

        // Generate random password
    private String randomPassword (int lenght){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[lenght];
        for (int i=0; i<lenght; i++){
            int rand = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set the email capacity
    public void setEmailboxCapacity(int capacity){
        this.emailboxCapacity = capacity;
    }
    // Set the alternative email
    public void setAlternativeEmail(String altEmail){
        this.alternativeEmail=altEmail;
    }
    // Change the password
    public void changePassword (String password){
        this.password = password;
    }
    public int getEmailboxCapacity(){ return emailboxCapacity;}
    public String getAlternativeEmail () { return alternativeEmail;}
    public String getPassword(){ return password;}

    public String showInfo(){
        return "DISPLAY NAME:" + firstName + "" + lastName +
                "\nCOMPANY NAME:" + email +
                "\nMAILBOX CAPACITY:" + emailboxCapacity + "nb";

    }
}
