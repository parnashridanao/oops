
import java.util.Scanner;
public class ATMMachine {
    public static void main(String[] args) {
     int atmnumber=12345;
     int atmpin=123;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter ATM Number: ");
    int atmNumber=sc.nextInt();
    System.out.println("Enter Pin: ");
    int pin=sc.nextInt();
    if((atmnumber==atmNumber)&&(atmpin==pin)){
    System.out.println("Validation Done");
    }
    else{
        System.out.println("Incorrect ATM Number or pin");
    }
    }
    }

