public interface ICalculator {
int add (int a, int b);
int sub (int a, int b);
int mul (int a, int b);
int div (int a, int b);
void largest (int a, int b);
}
 public class Calculator implements ICalculator{
    public int add (int a, int b){
        int c=a+b;
        return c;
    }
    public int sub (int a, int b){
        int d=a-b;
        return d;
    }
    public int mul (int a, int b){
        int e=a*b;
        return e;
    }
    public int div (int a , int b){
         int f=a/b;
         return f;
    }
    public void largest (int a, int b){
        if (a>b){
            System.out.println("A is largest.");
        }
        else{
            System.out.println("B is largest.");
        }
    }
    public static void main(String[] args) {
        Calculator r= new Calculator();
    int result1= r.add(20,10);
    int result2= r.sub(20,10);
    int result3= r.mul(20,10);
    int result4= r.div(20,10);
    System.out.println("ADDITION:"+result1);
    System.out.println("SUBTRACTION:"+result2);
    System.out.println("MULTIPLICATION:"+result3);
    System.out.println("DIVISION:"+result4);
    r.largest(20,10);
}
}