import java.util.Scanner;

class Problem7_FibonacciSeries {
    public int nthFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Problem7_FibonacciSeries sol = new Problem7_FibonacciSeries();
        System.out.println(sol.nthFibonacci(n));
        sc.close();
    }
}



// OR


// import java.util.*;
// public class problem7_FibonacciSeries {
//     public static void main(String[] args) {
//         Scanner s=new Scanner(System.in);
//         int n=s.nextInt();
//         int a=0;
//         int b=1;
//         int c=0;
//         for(int i=2;i<n;i++){
//             c=a+b;
//             a=b;
//             b=c;
//         }
//         System.out.println(c);
//     }
// }


// OR

// import java.util.Scanner;

// class Solution {
//     public int nthFibonacci(int n) {
//         if (n <= 1) {
//             return n;
//         }
//         return nthFibonacci(n - 1) + nthFibonacci(n - 2);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         Solution sol = new Solution();
//         int result = sol.nthFibonacci(n);
//         System.out.println(result);
//         sc.close();
//     }
// }
