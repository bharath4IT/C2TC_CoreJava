public class Operators {
    public static void main(String args[]) {
        int x = 10;
        System.out.println(x++);// 10 (11)
        System.out.println(++x);// 12
        System.out.println(x--);// 12 (11)
        System.out.println(--x);// 10
        int a = 10;
        int b = 10;
        System.out.println(a++ + ++a);// 10+12=22
        System.out.println(b++ + b++);// 10+11=21
        boolean c = true;
        boolean d = false;
        System.out.println(~a);// -11 (minus of total positive value which starts from 0)
        System.out.println(~b);// 9 (positive of total minus, positive starts from 0)
        System.out.println(!c);// false (opposite of boolean value)
        System.out.println(!d);// true
        System.out.println(a + b);// 15
        System.out.println(a - b);// 5
        System.out.println(a * b);// 50
        System.out.println(a / b);// 2
        System.out.println(a % b);// 0
        // Java Left Shift Operator
        System.out.println(10 << 2);// 10*2^2=10*4=40
        System.out.println(10 << 3);// 10*2^3=10*8=80

        // Java Right Shift Operator
        System.out.println(10 >> 2);// 10/2^2=10/4=2
        System.out.println(20 >> 2);// 20/2^2=20/4=5
        System.out.println(20 >> 3);// 20/2^3=20/8=2
    }
}
