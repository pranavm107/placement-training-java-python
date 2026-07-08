class Student{
    String name;
    int RegNo;
    String Dept;
    float cgpa;
}

public class taskclassobj {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="Atharsh";
        s1.RegNo=006;
        s1.Dept="AI & ML";
        s1.cgpa=7.2f;
        System.out.println(s1.name);
        System.out.println(s1.RegNo);
        System.out.println(s1.Dept);
        System.out.println(s1.cgpa);

        Student s2 = new Student();
        s2.name="Pranav";
        s2.RegNo=010;
        s2.Dept="AI & ML";
        s2.cgpa=7.58f;
        System.out.println(s2.name);
        System.out.println(s2.RegNo);
        System.out.println(s2.Dept);
        System.out.println(s2.cgpa);
    }
}
