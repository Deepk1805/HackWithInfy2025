
import java.util.*;

public class Problem7_Minimum_Exercises_to_Feel_Tired {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int E = sc.nextInt();
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(minExercises(E,nums));
        sc.close();
    }
    public static int minExercises(int E,int[] nums){
        Arrays.sort(nums);
        int count=0;
        for(int i=nums.length-1;i>=0;i--){
            for(int j=0;j<2;j++){
                E-=nums[i];
                count++;
                if(E<=0){
                    return count;
                }
            }
        }
        return count;
    }
}