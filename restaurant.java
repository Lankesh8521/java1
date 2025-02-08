import java.util.*;

public class restaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bill = 0;
        int indian,chinese,choice;
        while (true)
        {
            System.out.println("menu");
            System.out.println("1.indian menu");
            System.out.println("2.chinese menu");
            System.out.println("3.exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:System.out.println("indian menu:");
                       System.out.println("1.paneer tika 220/-");
                       System.out.println("2.butter naan 50/-");
                       System.out.println("return");
                       System.out.println("Enter your choise");
                       indian = sc.nextInt();
                switch (indian)
                {
                    case 1:bill = bill+220;
                    break;
                    case 2:bill = bill+50;
                    break;
                    case 3:break;
                    default :System.out.print("invalid choise");
                    
                }
                break;
                case 2:System.out.println("chinese menu");
                System.out.println("1.momos 100/-");
                System.out.println("2.chowmein 50/-");
                System.out.println("3.exit");
                System.out.println("Enter your choice");
                chinese = sc.nextInt();
                switch (chinese)
                {
                case 1:bill = bill+100;
                break;
                case 2:bill = bill+50;
                break;
                case 3:break;
                default :System.out.println("invalid choise");
                }
                break;
                case 3:System.out.println("bill=" +bill);
                System.exit(0);
                default:System.out.println("invalid choise");      
            }
        }
    }
}
