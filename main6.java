public class main6 {

    public class Employee{
        String name;
        int age;
        int salary;

        Employee(String name,int age,int salary){
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        Employee(Employee other){
            this.name = other.name;
            this.age = other.age;
            this.salary = other.salary;
        }


    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Rohan",23,50000);
        Employee e2 = new Employee(e1);

        System.out.println(e2.name);
    }
}
