public class main {
public static void main(String[] args) {
        System.out.println("Narrowing");
        int myint=9;
        double mydouble=myint;
        System.out.println(myint);
        System.out.println("Widening");
        Double myDouble= 9.87;
        int myDouble1 = 0;
        int myint1=(int)myDouble1;
        System.out.println(mydouble);
    }
}
