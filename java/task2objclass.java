class Building {
    String sand;
    String cement;
    int money;

    void display() {
        System.out.println(sand);
        System.out.println(cement);
        System.out.println(money);
    }
}

public class task2objclass {
    public static void main(String[] args) {
        Building b1 = new Building();
        b1.sand = "Sand";
        b1.cement = "Cement";
        b1.money = 1000000;
        b1.display();

        Building b2 = new Building();
        b2.sand = "Sand";
        b2.cement = "Cement";
        b2.money = 2000000;
        b2.display();
    }
}
