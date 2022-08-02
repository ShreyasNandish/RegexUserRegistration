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

        regex.validFirstName(fname);
        regex.validLastName(lname);
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
}
