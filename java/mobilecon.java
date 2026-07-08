class mobile {
    String brand;
    String color;
    int price;
    mobile(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }
    mobile(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }
    mobile(String brand) {
        this.brand = brand;
    }
    void display() {
        System.out.println(brand);
        System.out.println(color);
        System.out.println(price);
    }
}

public class mobilecon {
    public static void main(String[] args) {
        mobile x = new mobile("Apple", "Red", 50000);
        x.display();

        mobile y = new mobile("Samsung", "Blue", 40000);
        y.display();

        mobile z = new mobile("Google");
        z.display();
    }
}
