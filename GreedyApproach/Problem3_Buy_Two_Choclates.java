import java.util.*;
public class Problem3_Buy_Two_Choclates {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int prices[]=new int[n];
        for(int i=0;i<n;i++){
            prices[i]=s.nextInt();
        }
        int money=s.nextInt();
        Arrays.sort(prices);
        if(prices[0]+prices[1]<=money){
            System.out.println( Math.abs(prices[0]+prices[1]-money));
        }else{
            System.out.println( money);
        }
        
        s.close();
    }
}
