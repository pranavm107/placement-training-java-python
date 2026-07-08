import java.util.*;

public class taskarray3 {

    public static void main(String[] args) {
        ArrayList<String> foods = new ArrayList<>();

        foods.add("Briyani");
        foods.add("Noodles");
        foods.add("Dosa");
        foods.add("Idli");
        foods.add("Parotta");

        System.out.println(foods.get(2));

        foods.set(2, "Chicken Briyani");

        System.out.println("Updated List: ");
        for (int i = 0; i < foods.size(); i++){
            System.out.println(foods.get(i));
        }
    }
    
}
