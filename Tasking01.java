import java.io.*;
class Tasking3 extends Thread{
    public void run(){
        for (int i=1; i<=20; i+=2){
            System.out.println("odd count:"+ i);
        }
    }
}
class Tasking4 extends Thread {
    public void run(){
        for (int i=2; i<=20; i+=2){
            System.out.println("even count:"+i);
        }
    }
}
public class Tasking01 {
    public static void main(String [] args){
        Tasking3 t1= new Tasking3();
        Tasking4 t2= new Tasking4();
        t1.start();
        t2.start();
    }
}