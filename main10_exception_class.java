class MyException extends Exception{ //custom exception
    @Override
    public String getMessage() {
        return ("I am get message");
    }
}


public class main10_exception_class {
    public static void main(String[] args) {
        int a = 9;
        if(a<10){
            try{
            throw new MyException();}
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
