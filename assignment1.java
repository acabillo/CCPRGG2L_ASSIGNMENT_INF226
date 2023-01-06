package MatcherClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {

        // Java program to check if a student email address is valid
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student email : ");
        String studentEmail = scan.nextLine();

        Pattern pattern = Pattern.compile("\\w+@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(studentEmail);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("WELCOME");
        } else {
            System.out.println("INVALID");
        } 
        System.out.println();
        

        // Java program to check if phone number is valid
        System.out.print("Enter phone number : ");
        String phoneNumber = scan.nextLine();

        match = Pattern.matches("\\+639[0-9]{9}", phoneNumber);

        if (match) {
            System.out.println("SAVED NUMBER");
        } else {
            System.out.println("INVALID");
        }
        System.out.println();
      

       // Java program to check if birthday is valid
        System.out.print("Enter birthday : ");
        String bday = scan.nextLine();

        match = Pattern.matches("\\d{4}-\\d{2}-\\d{2}", bday);
        if(match){
            System.out.println("VALID");
        } else{
            System.out.println("INVALID");
        }
       scan.close();
       System.out.println();
        }
    
}