class Solution 
{
    public int numDistinct(String s, String t) 
    {
      int[][] dp = new int[s.length()+5][t.length()+5];
        for(int i=0;i<dp.length;i++)
        {
          for(int j=0;j<dp[0].length;j++)
          {
            dp[i][j]=-1;
          }
        }
        return numDistinct(s,t,0,0,dp);
    }
  public static int numDistinct(String s, String t,int m,int n,int[][] dp)
  {
    if(n==t.length())
    {
      return 1;
    }
    if(m==s.length())
    {
      return 0;
    }
    int inc=0;
    int exc=0;
    if(dp[m][n]!=-1)
    {
      return dp[m][n];
    }
    if(s.charAt(m)==t.charAt(n))
    {
      inc = numDistinct(s,t,m+1,n+1,dp);
    }
    exc=numDistinct(s,t,m+1,n,dp);
    return dp[m][n]=inc+exc;
  }
}