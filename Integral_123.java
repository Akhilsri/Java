class Student{ //class
    String name; //attributes
    private int age;

    public void printInfo(){ //methods
        System.out.println(name);
        System.out.println(age);
    }

    // public Student(){ //empty constructor

    // }

    public Student(){ //constructor 1
        this.name = "John Cena";
        set_age(40);
    }

    public Student(String name, int age){ //constructor 2
        this.name = name;
        this.set_age(age);
    }

    // we can also pass the argument in a constructor

    public void set_age(int age){ //setter
        this.age = age;
    }

    public int get_age(){ //getter
        return age;
    }
}


public class Integral_123{ //main class
    public static void main(String[] args) {
        Student s1 = new Student("Jaan",19); //object & constructor overloading also occuring
        // s1.name = "Akhil"; 
        // s1.set_age(20); 

        s1.printInfo();
    }
}