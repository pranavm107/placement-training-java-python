class Students {
    String name;
    String phone;
    String department;
    Students(String name, String phone, String department) {
        this.name = name;
        this.phone = phone;
        this.department = department;
    }
    Students(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    Students(String name) {
        this.name = name;
    }
    void display() {
        System.out.println(name);
        System.out.println(phone);
        System.out.println(department);
    }
}

public class taskconstructor {
    public static void main(String[] args) {
        Students s1 = new Students("Pranav Agnesh M", "6382675859", "AI & ML");
        s1.display();

        Students s2 = new Students("Atharsh", "9600269881", "AI & ML");
        s2.display();
    }
}

