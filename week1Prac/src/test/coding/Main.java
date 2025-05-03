package test.coding;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ans = solution.solution(12345);
        System.out.println(ans);
    }
}

class Solution {
    public int[] solution(long n) {
        String a = Long.valueOf(n).toString();
        int [] ans = new int[a.length()];
        for (int i = 0; i < a.length(); i++) {
            ans[i] = a.charAt(a.length() - i - 1)-'0';
        }
        return ans;
    }
}