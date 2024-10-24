package q1;

public class Tester {
    public static void main(String[] args) {
        Worker worker =new Worker("tarek",500);
        System.out.println(worker);
        Supervisor supervisor = new Supervisor("siam",1000,"Dhaka");
        System.out.println(supervisor);
        Director director = new Director("hamim",20000,"Rajshahi");
        System.out.println(director);
    }
}
