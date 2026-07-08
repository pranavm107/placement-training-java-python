import java.util.Scanner;

class controls{
    public static void main(String[] args){
        for(int i =1; i<=10; i++)
            {
                if (i==5){
                    continue; //break; if break means it prints upto 1234 and stops
                }
                System.out.println(i);
            }
        }
}