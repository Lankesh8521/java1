public class butterfly {

// public static void zero_one_triangle(int n) {
//     for(int i=1; i<=n; i++) {
//         for(int j=1; j<=i; j++) {
//             if((i+j) % 2==0) {
//                 System.out.print("1");
//             } else {
//                 System.out.print("0");
//             }
//         }
//         System.out.println();
//     }
// }
//     public static void main(String[] args) {
//         zero_one_triangle(5);
//     }


//butterfly
public static void butterfly(int n) {
    // for 1st half
    for(int i=1; i<=n; i++) {
        // for stars-i
        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }
        // for spaces-2*(n-i)
        for(int j=1; j<=2*(n-i); j++) {
            System.out.print(" ");
        }
        // for stars-i
        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    //for 2nd half
    for(int i=n; i>=1; i--) {
            // for stars-i
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            // for spaces-2*(n-i)
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            // for stars-i
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[]args) {
         butterfly(5);
    }
}

