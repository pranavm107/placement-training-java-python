import java.util.Scanner;

public class taskarray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements:");
        for (int i = 0; i<=4; i++){
            arr[i] = sc.nextInt();
        }int sum=0;
        System.out.println("The sum of the array elements is:");
        for (int i = 0; i<=4; i++){
            sum = sum + arr[i];
            System.out.println(arr[i]);

        }
        System.out.println(sum);
    }
    
}
