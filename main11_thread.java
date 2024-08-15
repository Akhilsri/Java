class MyThread1 extends Thread{
    @Override
    public void run(){
        while(true){
        System.out.println("Thread1");
        System.out.println("I am Happy");
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        while(true){
        System.out.println("Thread2");
        System.out.println("I am Spectacular");
        }
    }
}



public class main11_thread {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
    }
}
