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
            long L = Long.parseLong(a[0]);
            long R = Long.parseLong(a[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.primeProduct(L, R));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static boolean isPrime(long l){
       if(l <= 3) return true;
       if(l % 2 == 0 ) return false;
       
       long lim = (long)(Math.sqrt(l)+1);
       for(long i=3; i <= lim; i+=2){
           if(l%i == 0) return false;
       }    
       
       return true;
   }
   
   static long primeProduct(long L, long R){
       long result = 1;
       
       for(long i=L; i<=R; i++){
           if(isPrime(i)){
               result *= i;
               result %= 1000000007;
           }
       }
       
       return result;
   }
}