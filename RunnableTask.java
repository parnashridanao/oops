class Task implements Runnable{
    public void run(){
        System.out.println("Task by implementing runnable.");
    }
}
public class RunnableTask {
    public static void main(String[] args) {
        Task t= new Task();
        Thread t1=new Thread();
        t1.start();
    }
}
