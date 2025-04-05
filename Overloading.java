import java.util.Scanner;
public class Overloading {
    static int area(int s){
        return s*s;
    }
    static double area (double r){
        return (22*r*r)/7;
    }
    static double area(double h, double b){
        return (b*h)/2;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter side:");
        int s=sc.nextInt();
        System.out.println("Enter radius:");
        double r=sc.nextDouble();
        System.out.println("Enter height:");
        double h=sc.nextDouble();
        System.out.println("Enter breadth:");
        double b=sc.nextDouble();
        System.out.println("Area of square:"+area(s));
        System.out.println("Area of circle:"+area(r));
        System.out.println("Area of trianglr:"+area(h,b));
    }
}


    


