class MyMainEmployee{
    String name;
    private int id;

    // public MyMainEmployee(){  //constructors
    //     this.id = 99;
    //     this.name = "Your_name";
    // }
    public MyMainEmployee(String Myname, int MyId){  //constructors
        this.id = MyId;
        this.name = Myname;
    }

    public void set_Id(int id){
        this.id = id;
    }
    public int get_Id(){
        return id;
    }
}

public class main3 {
    public static void main(String[] args) {
        MyMainEmployee Rohan = new MyMainEmployee("Akhil",14);
        // Rohan.set_Id(18);
        // Rohan.name = "Rohan";
        System.out.println(Rohan.get_Id());
        System.out.println(Rohan.name);
    }
}
