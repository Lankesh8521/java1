import java.util.*;
// first method

public class three {
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter x :");
        x = sc.nextInt();
        System.out.println("Enter y :");
        y = sc.nextInt();
        System.out.println("Enter z :");
        z = sc.nextInt();
        if(x==y && x==z) {
            System.out.println("All are same");
        }
        else {
            if(x>=y) {
                if(x>=z) {
                    System.out.println(x);
                }
                else {
                    System.out.println(z);
                }
            }
            else {
                if(y>=z)
                System.out.println(y);
                else
                System.out.println(z);
            }
        }
    }*/

    //second method

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter x :");
        x = sc.nextInt();
        System.out.println("Enter y :");
        y = sc.nextInt();
        System.out.println("Enter z :");
        z = sc.nextInt();
        if(x==y && x==z)
        System.out.println("All are same");
        else {
            if(x>=y && x>=z)
            System.out.println(x);
            else if(y>=x && y>=z)
            System.out.println(y);
            else
            System.out.println(z);
        }
    }*/

    //third method

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tmax, x,y,z;
        System.out.println("Enter x :");
        x = sc.nextInt();
        System.out.println("Enter y :");
        y = sc.nextInt();
        System.out.println("Enter z :");
        z = sc.nextInt();
        if(x==y && x==z)
        System.out.println("All are same");
        else {
           tmax = x;
           tmax= tmax<y?y:tmax;
           tmax= tmax<z?z:tmax;
           System.out.println(tmax);
        }
    }*/

    //fourth method

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tmax, x,y,z;
        System.out.println("Enter x :");
        x = sc.nextInt();
        System.out.println("Enter y :");
        y = sc.nextInt();
        System.out.println("Enter z :");
        z = sc.nextInt();
        if(x==y && x==z)
        System.out.println("All are same");
        else {
            tmax=x;
            tmax=tmax<y?y:tmax;
            tmax=tmax<=y?z:tmax;
            System.out.println(tmax);
        }*/

        //fifth method

        
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int tmax, x,y,z;
            System.out.println("Enter x :");
            x = sc.nextInt();
            System.out.println("Enter y :");
            y = sc.nextInt();
            System.out.println("Enter z :");
            z = sc.nextInt();
            if(x==y && x==z)
            System.out.println("All are same");
            else {
                System.out.println(x>=y && x>=z?x:y>=x && y>=z?y:z);
            }
    }
}