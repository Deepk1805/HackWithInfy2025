import java.util.*;
public class Problem5_DI_String_Match {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int n = s.length();
        int[] arr = new int[n + 1];
        int low = 0;
        int high = n;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'I') {
                arr[i] = low++;
            } else {
                arr[i] = high--;
            }
        }

        arr[n] = low;

        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
