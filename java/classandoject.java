class CarBasic{
    String brand;
    String model;
    int price;
}
public class classandoject {

    public static void main(String[] args) {
        CarBasic c1 = new CarBasic();
        c1.brand="BMW";
        c1.model="X5";
        c1.price=5000000;
        System.out.println(c1.brand);
        System.out.println(c1.model);
        System.out.println(c1.price);

        CarBasic c2 = new CarBasic();
        c2.brand="Audi";
        c2.model="A6";
        c2.price=6000000;
        System.out.println(c2.brand); 
        System.out.println(c2.model);
        System.out.println(c2.price);

        CarBasic c3 = new CarBasic();
        c3.brand="Range Rover";
        c3.model="Defender";
        c3.price=10000000;
        System.out.println(c3.brand);
        System.out.println(c3.model);
        System.out.println(c3.price);   
    }
}