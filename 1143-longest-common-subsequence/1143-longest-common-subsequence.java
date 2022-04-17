class Solution {
    public int longestCommonSubsequence(String s1, String s2) 
    {
      int[][] dp = new int[s1.length()][s2.length()];
        for(int[] a : dp)
          Arrays.fill(a,-1);
      return lcs(s1,s2,0,0,dp);
    }
  public static int lcs(String s1,String s2,int i,int j,int[][] dp)
  {
    int ans=0;
    if(i==s1.length() || j==s2.length())
    {
      return 0;
    }
    if(dp[i][j]!=-1)
    {
      return dp[i][j];
    }
    if(s1.charAt(i)==s2.charAt(j))
    {
      ans = 1+lcs(s1,s2,i+1,j+1,dp);
    }
    else
    {
      int firstdelete = lcs(s1,s2,i+1,j,dp);
      int seconddelete = lcs(s1,s2,i,j+1,dp);
      ans = Math.max(firstdelete,seconddelete);
    }
    return dp[i][j]=ans;
  }
}