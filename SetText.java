class MyException extends Exception {
    public MyException(String m){
        super (m);
    }
}
public class SetText {
    public static void main(String[] args) {
        try {
            throw new MyException("This is a custom Exception.");
        } catch (MyException ex){
            System.out.println("caught");
            System.out.println(ex.getMessage());
        }
    }
}
