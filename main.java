
class Employee{
    String name;
    int age;

    public void printInfo(){
        System.out.println(name);
        System.out.println(age);
    }
}

public class main{
    public static void main(String[] args) {
        
        Employee Akhil = new Employee();
        Employee john = new Employee();
        Akhil.name = "Akhil";
        Akhil.age = 19;
        john.name = "John";
        john.age = 19;
        Akhil.printInfo();
        john.printInfo();

    }
}