import java.util.ArrayList;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.println("--Student Details, Department of ILT--");

        System.out.println("How many students do you have?");
        int N = kb.nextInt();
        ArrayList<Student> students = new ArrayList<Student>();

        for(int i=0; i<N;i++)
        {
            System.out.println("\n--Student #"+(i+1)+"--");
            Student s = new Student();
            s.getInfo();
            students.add(s);
        }

        for(int i=0; i<N;i++)
        {
            System.out.println("\n--Student #"+(i+1)+"--");
            students.get(i).displayInfo();
        }
    }
}
