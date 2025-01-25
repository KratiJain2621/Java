import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class stringStudentList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline
        
        List<String> studentList = new ArrayList<>();
        System.out.println("Enter the names of students: ");        
        // Collect student names
        for (int i = 0; i < numStudents; i++) 
        {
            System.out.print((i + 1) + ": ");
            String studentName = sc.nextLine();
            studentList.add(studentName);
        }
        
        // Print the student list
        System.out.println("\nStudent List :");
        int count = 1;
        for (String student : studentList) {
            System.out.println(count+") "+student);
            count = count + 1;
        }
    }
}
