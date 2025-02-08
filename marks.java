import java.util.*;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int avg;
        System.out.println("Enter math marks:");
        int math = sc.nextInt();
        System.out.println("Enter chemistry marks:");
        int chemistry = sc.nextInt();
        System.out.println("Enter physics marks:");
        int physics = sc.nextInt();
        avg = (math+chemistry+physics)/3;
        if (avg>=90) {
            System.out.println("grade=A");
        }
        if (avg>=70 && avg<=90) {
            System.out.println("grsde=B");
        }
        if (avg>=50 && avg<=70) {
            System.out.println("grsde=C");
        }
        if (avg>=40 && avg<=50) {
            System.out.println("grade=D");
        }
        if (avg<=40) {
            System.out.println("Fail");
        }
    }
}

