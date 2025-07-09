import java.util.Scanner;
public class Problem3_MaximumSumNoAdjacent {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println(maxSum(arr,n));
    }
    public static int maxSum(int[] arr,int n){
        if(n==0) return 0;
        if(n==1) return arr[0];
        int[]dp=new int [n];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+arr[i]);
        }
        return dp[n-1];
    }
}
