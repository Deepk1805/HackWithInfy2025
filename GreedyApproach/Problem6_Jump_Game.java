import java.util.*;
public class Problem6_Jump_Game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int pos = n - 1;
        for(int i = n - 2; i >= 0; i--) {
            if(i + nums[i] >= pos) {
                pos = i;
            }
        }

        if(pos == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
    }
}