public class counter {
    public static void main(String[] args) {
        // int i = 1;
        //for( int i=1; i<=10; i++) {
           // System.out.println("hello world");
        //}

        //for( int line=1; line<=4; line++ ) {
           // System.out.println("****");
        //}

        //int n = 25032002;

        //while( n > 0) {
            //int lastDigit = n % 10;
            //System.out.print(lastDigit +"");
            //n = n / 10;
        //}
        //System.out.println();

        int n = 10899;
        int rev = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev*10) + lastDigit;
            n = n/10;
        }
        System.out.println();
    }
    
}
