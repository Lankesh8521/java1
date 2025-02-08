import java.util.*;


//fibonacci series
// public class abc {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number");
//         int n = sc.nextInt();
//         for (int a=0,b=1,c=1;c<=n;  )
//         {
//             System.out.println(c+ ",");
//             c=a+b;
//             a=b;
//             b=c;
//         }
//     }
// }



//a,b,ab,bab


// public class abc {
//          public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             int i;
//             String a="a",b="b",c="ab";
//             System.out.println("Enter number");
//             int n = sc.nextInt();
//             for (i=1;i<=n;i++ )
//             {
//                 System.out.print(c+ ",");
//                 c=a+b;
//                 a=b;
//                 b=c;
//             }
//         }
//     }


public class abc {
    public static void main(String[] args) {
        char ch;
        for (char a='A'; a<='Z'; a++) {
            for (char b='A'; b<=a; b++) {
                System.out.print(b);
            }
            System.out.println();
        }
    }
}



