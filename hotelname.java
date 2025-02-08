import java.util.*;
import java.io.*;

public class hotelname {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String item ="";
        int indian,chinese,choice,n;
        double bill=0;
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
                       System.out.println("1.paneer tika     220/-");
                       System.out.println("2.butter naan     50/-");
                       System.out.println("return");
                       System.out.println("Enter your choise");
                       indian = sc.nextInt();
                switch (indian)
                {
                    case 1:System.out.println("Enter quantity:");
                    n = sc.nextInt();
                    bill = bill + (220*n);
                    item = item +"\n paneer tika 220/- \t" + n +"\t"+(n*220);
                    break;
                    case 2:System.out.println("Enter quantity:");
                    n = sc.nextInt();
                    bill = bill + (50*n);
                    item = item +"\n butter naan 50/- \t" + n +"\t"+(n*50);
                    break;
                    case 3:break;
                    default :System.out.print("invalid choise");
                    
                }
                break;
                case 2:System.out.println("chinese menu");
                System.out.println("1.momos           100/-");
                System.out.println("2.chowmein        50/-");
                System.out.println("3.exit");
                System.out.println("Enter your choice");
                chinese = sc.nextInt();
                switch (chinese)
                {
                case 1:System.out.println("Enter quantity:");
                n = sc.nextInt();
                bill = bill + (100*n);
                item = item +"\n momos 100/- \t" + n +"\t"+(n*100);
                break;
                case 2:System.out.println("Enter quantity:");
                n = sc.nextInt();
                bill = bill + (50*n);
                item = item +"\n chowmein 50/- \t" + n +"\t"+(n*50);
                break;
                case 3:break;
                default :System.out.println("invalid choise");
                }
                break;
                case 3:System.out.println(item);
                System.out.println("bill=" +bill);
                try
                {
                    PrintWriter Pw = new PrintWriter("bill.txt");
                     Pw.println("balaji Restaurant");
                     Pw.println("********************");
                     Pw.println("item        rate         quantity       price ");
                     Pw.println("                                             ");
                     Pw.print(item);
                     Pw.println("                                             ");
                     Pw.println("total bill=" +bill);
                     Pw.println("                                             ");
                     Pw.close();
                     Runtime rt = Runtime.getRuntime();
                     rt.exec("notepad bill.txt");
                }
                catch(Exception ec)
                    {
                      System.out.println(ec);
                    }
                System.exit(0);
                default:System.out.println("invalid choise");      
            }
        }
    }
}
