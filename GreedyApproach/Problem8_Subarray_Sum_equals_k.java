import java.util.*;

public class Problem8_Subarray_Sum_equals_k {
     public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);
        int currSum = 0;
        int res = 0;

        for (int num : nums) {
            currSum += num;
            if (mp.containsKey(currSum - k)) {
                res += mp.get(currSum - k);
            }
            mp.put(currSum, mp.getOrDefault(currSum, 0) + 1);
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        Problem8_Subarray_Sum_equals_k sol = new Problem8_Subarray_Sum_equals_k();
        int result = sol.subarraySum(nums, k);

        System.out.println(result);
    }
}
