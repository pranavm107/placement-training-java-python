class father{
    void food(){
        System.out.println("Father buys a food");
    }
}

class son extends father{
    void cricket(){
        System.out.println("Son plays cricket");
    }
}

class daughter extends father{
    void sleeping(){
        System.out.println("Daughter sleeps");
    }
}

public class hiererchialinherit {
    public static void main(String[] args) {
        son s = new son();
        daughter d = new daughter();

        s.food();
        s.cricket();
        d.food();
        d.sleeping();
    }
}