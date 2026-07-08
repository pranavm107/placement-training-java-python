public class returntype {
    int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        returntype s1 = new returntype();
        int result = s1.sum(10, 20);
        System.out.println("Sum of two numbers is: " + result);
    }  
}