import java.util.Scanner;

public class dowhile {
    //public static void main(String[] args) {
        //int counter = 1;
        //do {
            //System.out.println("Hello World");
            //counter++;
        //}while ( counter <=100 );
    //}
    
    //public static void main(String[] args) {
        //for(int i=1; i<=5; i++) {
            //if(i==3) {
                //break;
            //}
            //System.out.println(i);
        //}
        //System.out.println("i am out of loop");
    //}

    //public static void main(String[] args) {
       //Scanner sc = new Scanner(System.in);
       
       //do {
            //System.out.print("enter your number : ");
            //int n = sc.nextInt();

            //if(n % 10 == 0) {
                //break;
            //}
            //System.out.println(n);
        //} while(true); 
    //}
    
    //public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        //do {
            //System.out.print("enter your number : ");
            //int n = sc.nextInt();

            //if(n % 10 ==0) {
                //continue;
            //}

            //System.out.println("number was :" +n);
        //}while (true);
    //}


     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 2) {
            System.out.println("n is Prime");
        } else {
            boolean isPrime = true;
            for(int i=2; i<=Math.sqrt(n); i++) {
                if(n % i == 0) {
                    isPrime = false;
                }
            }

            if(isPrime == true) {
                System.out.println("n is Prime");
            } else {
                System.out.println("n is not Prime");
            }
        }
    }
} 

