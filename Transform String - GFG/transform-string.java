// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String arr[] = br.readLine().split(" ");
                    String A = arr[0];
                    String B = arr[1];
                    Solution obj = new Solution();
                    System.out.println(obj.transform (A, B));
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    int transform (String str, String str2)
    {
        int n=str.length();
       int n1=str2.length();
       if(n!=n1) return -1;
       int []freq=new int[256];
       for(int i=0;i<n;i++){
           freq[str.charAt(i)]++;
           freq[str2.charAt(i)]--;
       }
       for(int i=0;i<256;i++){
           if(freq[i]!=0) return -1;
           // System.out.print(freq[i]+" ");
       }
       int res=0;
       int i=n-1;
       int j=n-1;
       while(i>=0){
           if(str.charAt(i)!=str2.charAt(j)){
              res++;
           }
           else{
               j--;
           }
           i--;
       }
       return res;
        // code here
    }
}