class Student{
    String name;
    int age;
}

class topper extends Student{
    String title;
    int code;
}

public class main4 {
    public static void main(String[] args) {
        topper s1 = new topper();
        s1.name = "Akhil";
        s1.age = 19;
    }
}
