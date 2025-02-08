import java.util.*;

public class sakshi {
  public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in) ;
    double l,b,a,p;
    System.out.println("Enter l:");
    l=Sc.nextDouble();
    System.out.println("Enter b:");
    b=Sc.nextDouble();
    a=l*b;
    System.out.println("area="+a);
    p=2*(l+b);
    System.out.println("Perimeter="+p);
  }  
}
