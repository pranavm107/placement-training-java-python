import java.util.Scanner;

class oddoreven{
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);
        int nums = number.nextInt();
        if (nums % 2 == 0)
            {
            System.out.println("The Number is Even");
        }else{
            System.out.println("The number is odd");
        }
    }
}