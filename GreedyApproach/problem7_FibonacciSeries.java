import java.util.*;
public class problem7_FibonacciSeries {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0;
        int b=1;
        int c=0;
        for(int i=2;i<n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(c);
    }
}


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
