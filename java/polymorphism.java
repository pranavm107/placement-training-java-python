class Restaurant {

    void order(String food) {
        System.out.println("You ordered " + food);
    }
    void order(String item, int quantity) {
        System.out.println("You ordered " + quantity + " " + item);
    }
    void order(String item1, String item2, String item3) {
        System.out.println("You ordered " + item1 + ", " + item2 + " and " + item3);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        Restaurant r = new Restaurant();
        r.order("Grill Chicken");
        r.order("Ice Cream", 55);
        r.order("Tea", "Coffee", "Cookies");
    }
}