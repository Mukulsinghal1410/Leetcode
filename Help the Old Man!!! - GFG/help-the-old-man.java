// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(a[0]);
            int n = Integer.parseInt(a[1]);
            
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.shiftPile(N, n);
            System.out.println(ans.get(0)+" "+ans.get(1));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int n1,n2,k;
    
    static void solve(int n, int a, int c, int b, int l){
        if(n==0) return;
        solve(n-1,a,b,c,l);
        k++;
        if(k==l){
            n1 = a;
            n2 = c;
            return;
        }
        solve(n-1,b,c,a,l);
    }
    
    static List<Integer> shiftPile(int N, int n){
        // code here
        k=0;
        solve(N,1,3,2,n);
        return Arrays.asList(n1,n2);
    }
}