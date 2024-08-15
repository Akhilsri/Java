class MyEmployee{
    String name;
    private int id;

    public void set_Id(int id){
        this.id = id;
    }
    public int get_Id(){
        return id;
    }
}

public class main2 {
    public static void main(String[] args) {
        MyEmployee Rohan = new MyEmployee();
        Rohan.set_Id(18);
        Rohan.name = "Rohan";
        System.out.println(Rohan.get_Id());

    }
}
