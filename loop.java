 import java.util.*;
//n types number
// public class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter n");
//         int n = sc.nextInt();
//         int i = 1;
//         for (i=0; i<=n; i++)
//         {
//             System.out.println(i);
//         }

//     }
// }


// 2,4,6.. numbers
// public class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter n");
//         int n = sc.nextInt();
//         int i = 2;
//         for (i=2; i<=n; i=i+2)
//         {
//             System.out.println(i);
//         }

//     }
// }




//1,3,5..numbers
// public class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter n");
//         int n = sc.nextInt();
//         int i = 1;
//         for (i=1; i<=n; i=i+2)
//         {
//             System.out.println(i);
//         }

//     }
// }


//1024,512,squre number
// public class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter n");
//         int i = sc.nextInt();
//         int num = 2048;
//         for (i = num; i>=1; i/=2)
//         {
//             System.out.println(i);
//         }

//     }
// }


//1,3,4,7,9,11,16,...

// public class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter n");
//         int n = sc.nextInt();
//         int i = 1;
//         for (i = 0; i<=n; i=2)
//         {
//             System.out.println(i);
//         }
//     }
// }



// public class loop {
//     public static void main(String[] args) {
//         int i = 10;
//         int j = 1;
//         for (i=10, j=1; i>=1; i--,j++)
//         {
//             System.out.println(i+","+j+",");
//         }
//     }
// }


public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int x = sc.nextInt();
        int i = 0;
        double v = 1, f=1, s=0;
        for (i=1; i<=x; i++) {
             v = v*x;
             f=f*i;
             System.out.println(v+"/"+f+"+");
             s = s+(double)v/f;
        }
        System.out.println("\b=" +s);
    }
}
