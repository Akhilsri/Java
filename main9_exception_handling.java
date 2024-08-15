import java.io.IOException;

public class main9_exception_handling {
    public static void main(String[] args) {
         int a = 100;
         int b = 0;

         try{
         int c = a/b;
         System.out.println(c);
         }
         catch(ArithmeticException e){
            System.out.println("This is an exception : ");
            System.out.println(e);
         }
         catch(Exception e){
            System.out.println("Exception");
         }
         
    }
}
