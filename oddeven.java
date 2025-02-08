import java.util.*;

public class oddeven {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    System.out.println("Enter a number");
    num = sc.nextInt();
    switch (num % 2) {
        case 0: System.out.println("Even");
        break;
        case 1: System.out.println("odd");
        break;
       }
   } 
}
