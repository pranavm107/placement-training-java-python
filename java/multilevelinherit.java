class Grandparent{
    void land(){
        System.out.println("Grandparent own a land");
    }
}

class Parent extends Grandparent{
    void house(){
        System.out.println("Parent own a house");
    }
}

class child extends Parent{
    void car(){
        System.out.println("Child own a car");
    }
}

public class multilevelinherit {
    public static void main(String[] args) {
        child c = new child();
        c.land();
        c.house();
        c.car();
    }
}
