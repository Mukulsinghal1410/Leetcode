// { Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while (t-- > 0)
        {
            int n = sc.nextInt();
            
            System.out.println(new Solution().findNum(n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
   int  findNum(int n)
   {
       
       
       int low = 0;
       int high = 5*n;
       int ans = low;
       while(low <= high){
           int mid = (low + high)/2;
           int zeros = findzeros(mid);
           if(zeros >= n)
           {
               ans = mid;
               high = mid - 1;
           }
           else  low = mid + 1;
       }
       return ans;
       
   }
   int findzeros(int x){
       int demo = 5;
       int zeros = 0;
       while(x >= demo)
       {
           zeros+=(x/demo);
           demo*= 5;
       }
       return zeros;
       
   }
   
}