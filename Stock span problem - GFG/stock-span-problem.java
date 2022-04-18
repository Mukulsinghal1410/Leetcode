// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int a[] = new int[n];
            
            int i = 0;
            for(i = 0; i < n; i++)
              a[i] = sc.nextInt();
              
            int[] s = new Solution().calculateSpan(a, n);
            
            for(i = 0; i < n; i++)
            {
                System.out.print(s[i] + " ");
            }
            
            System.out.println();
        }
    }
    
    
    
}// } Driver Code Ends



class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int ht[], int n)
    {
        int span[] = new int[ht.length];
        span[0]=1;
        Stack<Integer> visit = new Stack<>();
        visit.push(0);
        for(int curr =1;curr<ht.length;curr++)
        {
            while(!visit.isEmpty() && ht[visit.peek()]<=ht[curr])
            {
                visit.pop();
            }
            if(visit.isEmpty())
            {
                span[curr]=curr+1;
            }
            else
            {
                span[curr] = curr - visit.peek();
            }
            visit.push(curr);
        }
        return span;
    }
    
}