Approach-1:
  ------------

class Solution {
    public int minFallingPathSum(int[][] A) {
        int len = A.length;
        if(len == 0) return 0;
        int[][] dp = new int[len][len];
        for(int i = 0; i < len; i++){
            dp[0][i] = A[0][i];
        }
        for(int i = 1; i < len; i++){
            for(int j = 0; j < len; j++){
                dp[i][j] = Math.min(Math.min(j > 0 ? dp[i - 1][j - 1]: Integer.MAX_VALUE, j + 1 < len ? dp[i - 1][j + 1]: Integer.MAX_VALUE), dp[i - 1][j]) + A[i][j];
            }
        }
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < len; i++)
            res = Math.min(res, dp[len - 1][i]);
        return res;
    }
}

Approach 2
------------

class Solution {
     public int minFallingPathSum(int[][] A) {
        int r = A.length;
        int c = A[0].length;
        int ans = Integer.MAX_VALUE;
       for(int i = 0; i<c; i++)
          ans = Math.min(ans, rec(0, i, A));
        
        
        return ans;
    }
    private static int rec(int i, int j, int arr[][]){
        int r = arr.length;
        int c = arr[0].length;
        if( i == r){
            return 0;
        }
        if(j <0 || j >=c) return Integer.MAX_VALUE;
           
        
        int op1 =  rec(i+1, j-1, arr);
        int op2 =  rec(i+1, j,   arr);  
        int op3 =  rec(i+1, j+1, arr);
   
        return arr[i][j] + Math.min(op1, Math.min(op2, op3));
    }
}
