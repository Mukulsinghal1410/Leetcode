//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            long X = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.jumpingNums(X));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    static long jumpingNums(long X) 
    {
        // code here
        Queue<Long> ques = new LinkedList<>();
        for(long i=1;i<=9;i++)
        {
            ques.add(i);
        }
        long answ = 0;
        
        while(!ques.isEmpty())
        {
            long num = ques.remove();
            if(num > X) 
            {
                continue;
            }
            answ = Math.max(answ , num);
            int lo = (int) num%10;
            if(lo!=0)
            {
                long f = num*10+(lo-1);
                ques.add(f);
            }
            if(lo!=9){
                long s = num*10+(lo+1);
                ques.add(s);
            }
        }
        return answ;
    }
};