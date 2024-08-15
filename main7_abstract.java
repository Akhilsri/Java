abstract class Parent{ //abstract class
    public Parent(){
        System.out.println("Mai constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }

    abstract public void greet(); //abstract method


}


class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Namaste");
    }
}




public class main7_abstract {
    public static void main(String[] args) {
        // Parent p = new Parent();//we cannot make object of abstract class
    }
}
