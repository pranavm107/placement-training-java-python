class Sample{
    static void sum(int a, int b){
        int c = a + b;
        System.out.println(c);
    }
    static void mult(int a, int b){
        int c = a * b;
        System.out.println(c);
    }
    static void divide(int a, int b){
        int c = a / b;
        System.out.println(c);
    }
    static void sub(int a, int b){
        int c = a - b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        sum(10, 5);
        sub(150, 140);
        mult(10, 5);
        divide(10, 5);
        
    }
}