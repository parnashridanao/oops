public class ComplexNumber {
    public static void main(String[] args) {
        int a,b,c,d;
        int num1=2;
        int imaginary=5;
        int num2=4;
        int imaginary2=6;
        c=num1+num2;
        d=imaginary+imaginary2;
        a=(num1*num2)-(imaginary-imaginary2);
        b=(num1*imaginary2)+(num2*imaginary);
        System.out.println("c="+num1+"+"+imaginary+"i");
        System.out.println("d="+num2+"+"+imaginary2+"i");
        System.out.println("num3="+c+"+"+d+"i");
        System.out.println("num4="+a+"+"+b+"i");
    }
}
