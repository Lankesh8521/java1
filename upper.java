import java.util.*;

public class upper {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a character: ");
    char ch=sc.next().charAt(0);
    if(ch >= 'A' && ch <= 'Z')
    System.out.print("Upper Case");
    else if(ch >= 'a' && ch <= 'z')
    System.out.print("Lower Case.");
    else
    System.out.print("Not a Letter.");
    }
}
