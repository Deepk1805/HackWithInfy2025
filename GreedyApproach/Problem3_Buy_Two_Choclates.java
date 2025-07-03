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
       int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(min1>prices[i]){
                min2=min1;
                min1=prices[i];
            }else if(prices[i]<min2){
                min2=prices[i];
            }
        }
        int cost=min1+min2;
        if(cost<=money){
            System.out.println( Math.abs(cost-money));
        }else{
            System.out.println( money);
        }
        
        s.close();
    }
}






            // OR 



// import java.util.*;
// public class Problem3_Buy_Two_Choclates {
//     public static void main(String[] args) {
//         Scanner s=new Scanner(System.in);
//         int n=s.nextInt();
//         int prices[]=new int[n];
//         for(int i=0;i<n;i++){
//             prices[i]=s.nextInt();
//         }
//         int money=s.nextInt();
//        Arrays.sort(prices);
//         if(prices[0]+prices[1]<=money){
//             System.out.println( Math.abs(prices[0]+prices[1]-money));
//         }else{
//             System.out.println(money);
//         }
//         s.close();
//     }
// }
