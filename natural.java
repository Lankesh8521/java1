public class natural {
    public static void main(String[] args) {
        Scanner sc = Scanner(System);
        int n = sc.nextInt();
        int sum = 0;

        int i=1;
        while(i <= n) {
            sum += i;
            i++;
        }

        System.out.println("sum is : " + sum);
    }
    
    
}
