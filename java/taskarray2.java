 import java.util.*;
public class taskarray2 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
         students.add("Pranav");
         students.add("Bharathvaj");
         students.add("Abhiram");
         students.add("Atharsh");
         students.add("Dhanush");
         System.out.println( "Student Names: ");

         for(int i = 0; i<students.size(); i++){
            System.out.println(students.get(i));
         }
         System.out.println("Total Students: " + students.size());
    }
}
