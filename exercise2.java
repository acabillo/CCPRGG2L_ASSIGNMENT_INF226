package Recursion;
import java.util.Scanner;



public class exercise2 {



    static Scanner scan = new Scanner(System.in);



    public static void main(String[] args) throws Exception {



        drive("Training");

        scan.close();

    }



    static void drive(String training) {



        System.out.println("Training!");

        practice(training);



        String feedback = getFeedBack(training);



        // // Define the base case / stopping condition

        if (feedback.equals("no")) {


            // Do something to reach the goal

           improvement(training);



             // Recursive call

             drive(training);

         } else if (feedback.equals("yes")) {

            passed(training);

        }

    }



    static void practice(String training) {

        System.out.println("Driving a car");

    }



    static String getFeedBack(String training) {

        System.out.println("Passed or not? (Enter \"yes\" or \"no\")");



        String feedback = scan.next();



        return feedback;

    }



    static void improvement(String training) {

        System.out.print("What skill to improve? :");

        String skills = scan.next();

        System.out.println("Practicing " + skills + " skill");

    }



    static void passed(String training) {

        System.out.println("Passed " + training );

    }



}