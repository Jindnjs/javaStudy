package test.coding;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int ans = solution.solution(10);
        System.out.println(ans);
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i < n; i++){
            if ( n % i == 1)
                answer = i;
            break;
        }
        return answer;
    }
}