import java.util.ArrayList;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);


        do {
            System.out.println("Please enter the PeopleSoft ID:");
            String s = kb.nextLine();
            if(s.matches("^[com|org|edu]")){
            System.out.println("PeopleSoft ID accepted.");
            break;
            }
            System.out.println("PeopleSoft ID can only contain from 1 to 7 numbers. Please try again");
        }while(true);


        System.out.println("--Assignment 2 Student Profiles--\n");

        System.out.println("How many students do you have?");
        int N = kb.nextInt();
        ArrayList<Student> students = new ArrayList<Student>();

        Student s1 = new Student();
        s1.getInfo();


    }
}
