import java.util.*;

public class demo {
    /*public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Double l,b,a,p;
        System.out.println("Enter l :");
        l = sc.nextDouble();
        System.out.println("Enter b :");
        b = sc.nextDouble();
        a = l*b;
        System.out.println("area="+a);
        p = 2*(a+b);
        System.out.println("perimeter="+p);
    }*/

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r,a,c;
        System.out.println("Enter Radius:");
        r = sc.nextDouble();
        a = 3.14*r*r;
        System.out.println("area = "+a);
        r = 2*3.14*r;
        System.out.println("circumference = "+r);
    }*/
    
    
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter x :");
        x = sc.nextInt();
        System.out.println("Enter y :");
        y = sc.nextInt();
        z=x;
        x=y;
        y=z;
        System.out.println("x="+x);
        System.out.println("y="+y);
    }*/

    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter x :");
        x = sc.nextInt();
        System.out.println("Enter y :");
        y = sc.nextInt();
        System.out.println("Enter z :");
        z = sc.nextInt();
        x=x+y+z;
        y=x-y/z;
        z=x-y*z;
        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
    }

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter x :");
        x = sc.nextInt();
        System.out.println("Enter y :");
        y = sc.nextInt();
        x=x*y;
        y=x/y;
        x=x/y;
        System.out.println("x="+x);
        System.out.println("y="+y);
    }

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter x :");
        x = sc.nextInt();
        System.out.println("Enter y :");
        y = sc.nextInt();
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println("x="+x);
        System.out.println("y="+y);
    }*/
}
