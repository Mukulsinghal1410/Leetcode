class Solution 
{
  public boolean isPalindrome(int x) 
  {
    String s = String.valueOf(x);
    char[] c1 = s.toCharArray();
    int r = c1.length-1;
    int f = 0;
    while(f<c1.length/2 && r>=c1.length/2)
    {
      if(c1[f]!=c1[r])
      {
        return false;
      }
    f++;
    r--;
    }
    return true;
  }
}