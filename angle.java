import java.util.*;

public class angle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter triangles First, Second & third Angles = ");
    int ang1, ang2, ang3, total;
    ang1 = sc.nextInt();
    ang2 = sc.nextInt();
    ang3 = sc.nextInt();
    total = ang1 + ang2 + ang3;
    if(total==180 && ang1 !=0 && ang2 !=0 && ang3 !=0) {
        System.out.println(" it is a valid triangle");
    }
    else {
        System.out.println("it is not a valid triangle");
    }
  }  
}
