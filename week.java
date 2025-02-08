import java.util.*;

public class week {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayNum;
        System.out.println("Enter day number: ");
        dayNum = sc.nextInt();
        switch(dayNum)
        {
            case 1: System.out.println("sunday");
            break;
            case 2: System.out.println("monday");
            break;
            case 3: System.out.println("tuesday");
            break;
            case 4: System.out.println("wednesday");
            break;
            case 5: System.out.println("thursday");
            break;
            case 6: System.out.println("friday");
            break;
            case 7: System.out.println("saturday");
            break;
            case 8: System.out.println("invalid day number");
            break;
        }
    }
}
