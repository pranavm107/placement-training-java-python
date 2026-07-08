class Car{
    String brand;
    String model;
    int price;
    //method declaration
    void display(){
        System.out.println(brand);
        System.out.println(model);
        System.out.println(price);
    }
}
public class displaymethod {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand="BMW";
        c1.model="X5";
        c1.price=5000000;
        c1.display();       //method call

        Car c2 = new Car();
        c2.brand="Audi";
        c2.model="A6";
        c2.price=6000000;
        c2.display();

        Car c3 = new Car();
        c3.brand="Range Rover";
        c3.model="Defender";
        c3.price=10000000;
        c3.display();   
    }
    
}
