// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.superPrimes(n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    boolean isPrime(int x){
        if(x<=1)
            return false;
        for(int i=2;i<=Math.sqrt(x);i++){
            if(x%i==0)
                return false;
        }
        return true;
    }
    
    int superPrimes(int n) {
        int count=0;
        for(int i=n;i>=5;i--){
            if(isPrime(i) && isPrime(i-2))
                count++;
        }
        return count;
    }
}