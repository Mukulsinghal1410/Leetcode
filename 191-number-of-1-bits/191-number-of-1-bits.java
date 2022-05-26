public class Solution {
    // you need to treat n as an unsigned value
   public int hammingWeight(int n) 
   {
    int ans=0;
    String temp = Integer.toBinaryString(n);
    int len=temp.length();
    for(int i=0;i<len;++i){
        if(temp.charAt(i)=='1'){
             ans++;
        }
    }
    return ans;
  }
}