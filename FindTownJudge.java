class Solution {
    public int findJudge(int n, int[][] trust) {
        // 1st value of pair denotes how many he trusts
        // 2nd value of pair denotes how many trust him
        int[][] arr = new int[n+1][2];
        
        for (int i = 0; i < trust.length; ++i) {
            arr[trust[i][0]][0] += 1;
            arr[trust[i][1]][1] += 1;
        }
        
        // Now find who is trusted by N-1 others and he/she does not trust others
        for (int i = 1; i <= n; ++i) {
            if (arr[i][0] == 0 && arr[i][1] == n - 1) {
                return i;
            }
        }
        
        return -1;
    }
}
