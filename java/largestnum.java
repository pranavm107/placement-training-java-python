import java.util.Scanner;

class largestnum{
    public static void main(String[] args){

        Scanner number1 = new Scanner(System.in);
        System.out.print("Enter a number1: ");
        int num1 = number1.nextInt();

        System.out.print("Enter a number2: ");
        Scanner number2 = new Scanner(System.in);
        int num2 = number2.nextInt();

        System.out.print("Enter a number3: ");
        Scanner number3 = new Scanner(System.in);
        int num3 = number3.nextInt();

        if (num1 > num2){
            System.out.println(num1 + " is a greater number");
        }
        else if(num2>num3)
        {
            System.out.println(num2 + " is a greater number");
        }else{
            System.out.println(num3 + " is a greater number");
        }
    }
} 