class Solution {
    public int climbStairs(int n) {
        int[] fibonacci = new int[n+1];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for(int i=2; i<=n; i++){
            fibonacci[i] = fibonacci[i-2] + fibonacci[i-1];
        }
        return fibonacci[n];
    }
}
