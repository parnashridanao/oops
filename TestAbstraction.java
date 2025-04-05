abstract class Bike{
    Bike(){
    System.out.println("Bike is created.");
    }
    abstract void run();
    void changeGear(){
        System.out.println("Gear changed.");
    }
}
class Honda extends Bike{
    void run(){
        System.out.println("Running safely.");
    }
}
public class TestAbstraction {
    public static void main(String[] args) {
        Honda h=new Honda();
        h.run();
        h.changeGear();
    }
    
}
