class construction {
    String sand;
    String cement;
    int money;
    construction(String sand, String cement, int money) {
        this.sand = sand;        this.cement = cement;
        this.money = money;
    }
    construction(String sand, String cement) {
        this.sand = sand;
        this.cement = cement;
    }
    construction(String sand) {
        this.sand = sand;
    }
    void display() {
        System.out.println(sand);
        System.out.println(cement);
        System.out.println(money);
    }
}

public class building {
    public static void main(String[] args) {
        construction b1 = new construction("M Sand", "UltraTech", 1000000);
        b1.display();

        construction b2 = new construction("P Sand", "Ramco", 2000000);
        b2.display();
        
    }
}
