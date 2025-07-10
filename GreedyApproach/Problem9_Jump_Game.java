import java.util.*;

public class Problem9_Jump_Game {

    public boolean canJump(int[] nums) {
        int finalP = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            finalP = (i + nums[i] >= finalP) ? i : finalP;
        }
        return finalP == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Problem9_Jump_Game sol = new Problem9_Jump_Game();
        System.out.println(sol.canJump(nums));
    }
}
