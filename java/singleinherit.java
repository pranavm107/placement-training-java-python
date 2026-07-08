class parent{
    void bike(){
        System.out.println("Parent own a bike");
    }
}

class child extends parent{
    void college(){
        System.out.println("Child in a college");
    }
}

public class singleinherit{
    public static void main(String[] args) {
        child c = new child();
        c.bike();
        c.college();
    }
}