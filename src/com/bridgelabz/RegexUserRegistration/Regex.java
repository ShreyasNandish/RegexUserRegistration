package com.bridgelabz.RegexUserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex {
    public static void main(String[] args) {
        Regex regex = new Regex();

        Scanner scanner = new Scanner(System.in);

        System.out.println(" enter first name :");
        String fname = scanner.nextLine();
        System.out.println(" enter last name :");
        String lname = scanner.nextLine();
        System.out.println(" enter email ID :");
        String mailId = scanner.nextLine();
        System.out.println(" enter phone number :");
        String phoneNumber = scanner.nextLine();
        System.out.println(" enter password :");
        String password = scanner.nextLine();

        regex.validFirstName(fname);
        regex.validLastName(lname);
        regex.validMailId(mailId);
        regex.validMobileNumber(phoneNumber);
        regex.validPassword(password);
    }

    public void validFirstName(String fname)
    {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{2,}");

        Matcher matcher = pattern.matcher(fname);
        if(matcher.matches())
            System.out.println("Given first name is valid ");
        else
            System.out.println("Given first name is not valid ");
    }

    public void validLastName(String lname)
    {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{2,}");

        Matcher matcher = pattern.matcher(lname);
        if(matcher.matches())
            System.out.println("Given last name is valid ");
        else
            System.out.println("Given last name is not valid ");
    }

    public void validMailId(String mailId)
    {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+([._-][a-zA-Z0-9]+)*@[a-z]+([.][a-z])*([.][a-z]+)$");

        Matcher matcher = pattern.matcher(mailId);
        if(matcher.matches())
            System.out.println("Given email is valid ");
        else
            System.out.println("Given email is not valid ");
    }

    public void validMobileNumber(String phonenumber) {

        Pattern pattern = Pattern.compile("^(91[ ])?[6-9]\\d{9}$");

        Matcher matcher = pattern.matcher(phonenumber);
        if (matcher.matches()) {
            System.out.println("Mobile No: " + phonenumber + " is valid.");
        } else {
            System.out.println("Mobile No: " + phonenumber+ " is invalid.");
        }
    }

    public void validPassword(String password)
    {
        Pattern pattern = Pattern.compile("(?=.*[A-Z])[a-zA-Z0-9@#$%^&*()]{8,}$");

        Matcher matcher = pattern.matcher(password);
        if(matcher.matches())
            System.out.println("Given password is valid ");
        else
            System.out.println("Given password is not valid ");
    }
}
