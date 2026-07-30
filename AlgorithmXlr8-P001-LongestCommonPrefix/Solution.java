import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) strs[i] = sc.next();
        
        String res = strs[0];

        for (int i = 1; i < strs.length; i++) {

            int nn = Math.min(res.length(), strs[i].length());
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < nn; j++) {

                if (res.charAt(j) == strs[i].charAt(j)) {
                    sb.append(res.charAt(j));
                } else {
                    break;
                }
            }

            res = sb.toString();
        }

        System.out.print(res);
        sc.close();

        // Write your solution here.
        // Print the longest common prefix among all strings in strs, or an
        // empty line if there is none.
    }
}
