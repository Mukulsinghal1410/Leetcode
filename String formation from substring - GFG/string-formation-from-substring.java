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
            String input = read.readLine();
            
            Solution ob = new Solution();
            int result = ob.isRepeat(input);
            
            System.out.println(result);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution 
{
    int isRepeat(String s) 
    {
        //System.out.println(s.substring(1));
        // System.out.println(s.substring(0,s.length()-1));
        // System.out.println(s.substring(0,s.length()-1)+s.substring(1));
       // code here
       if ((s.substring(1)+s.substring(0,s.length()-1)).contains(s))
        {
            return 1;
        }
      return 0;
   }
}