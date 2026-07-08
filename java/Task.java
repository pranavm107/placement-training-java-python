import java.util.Scanner;

class Task {
    public static void main(String[] args) {
        Scanner details = new Scanner(System.in);
        String name = details.nextLine();
        System.out.println("Name : " + name);
        int RegNo = details.nextInt();
        System.out.println("Registration number : " + RegNo);

        float cgpa = details.nextFloat();
        System.out.println("CGPA : " + cgpa);
    }
}
