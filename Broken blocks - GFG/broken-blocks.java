// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S = br.readLine().trim().split(" ");
            int m = Integer.parseInt(S[0]);
            int n = Integer.parseInt(S[1]);
            int[][] matrix = new int[m][n];
            for(int i = 0; i < m; i++){
                String[] s = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++)
                    matrix[i][j] = Integer.parseInt(s[j]);
            }
            Solution obj = new Solution();
            int ans = obj.MaxGold(matrix);
            System.out.println(ans);

        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int MaxGold(int[][] matrix)
    {
        // Code here
        int n = matrix.length, m = matrix[0].length;
        int[][] dp = new int[n + 1][m + 1];


        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] != -1)
                    dp[i][j] = matrix[i][j] +
                            Math.max(j > 0 ? dp[i + 1][j - 1] : 0,
                                    Math.max(dp[i + 1][j + 1], dp[i + 1][j]));
            }
        }
        int ans = 0;
        for (int i = 0; i < m; i++)
            ans = Math.max(ans, dp[0][i]);
        return ans;
    }
}