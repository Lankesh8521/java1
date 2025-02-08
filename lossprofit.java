import java.util.*;

public class lossprofit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sellingPrice, costPrice;
        System.out.println("Enter the selling Price:");
        sellingPrice = sc.nextDouble();
        System.out.println("Enter the cost Price:");
        costPrice = sc.nextDouble();
        double profit = 0;
        double loss = 0;
        if(sellingPrice==costPrice)
           System.out.println("No profit No loss");
        else
        {
           if (sellingPrice > costPrice) 
           {
            profit = sellingPrice - costPrice;
            System.out.println("profit: " + profit);
            System.out.println("profitpercent: " + ((profit*100/costPrice) + "%"));
           } 
           else if(sellingPrice < costPrice) 
           {
                loss = costPrice -sellingPrice;
                System.out.println("loss: " + loss);
                System.out.println("losspercent: " +((loss*100/costPrice) + "%"));
           }
        }
    }
}
