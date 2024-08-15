class Base{
    int x;
    Base(){
        System.out.println("I am constructor from Base");
    }   
    Base(int a){
        System.out.println("I am overloaded constructor from Base as a :"+a);
    }
}

class Derived extends Base{
    int y;
    Derived(){
        super(0); //when we want to run the constructor having argument
        System.out.println("I am Derived class constructor");
    }
}




public class main5 {

    public static void main(String[] args) {
        Base b = new Base();
        //It will run first base class constructor then derived class constructor
        Derived d = new Derived();


    }
}
