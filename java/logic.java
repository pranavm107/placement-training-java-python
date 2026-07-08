import java.util.*;

class logic{
    public static void main(String[] args){
        int rev = 0; // it is where ans is stored
        int n = 4756; 
        int digit = n%10; //6
        rev = rev + digit;
        n = n/10;
        System.out.println(n);
    }
}