public class pattern {
    /*public static void main(String[] args) {
        for(int line=1; line<=95; line++) {
            //one line
            for(int star=1; star<=line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }*/


    /*public static void main(String[] args) {
        int n = 95;
        for(int line=1; line<=n; line++) {
            for(int star=1; star<=n-line+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }*/



    /*public static void main(String[] args) {
        int n = 25;
        for(int line=1; line<=n; line++) {
            for(int number=1; number<=line; number++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }*/


    public static void main(String[] args) {
        int n = 6;
        char ch = 'A';
        for(int line=1; line<=n; line++) {
            for(int chars=1; chars<=line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    
}
