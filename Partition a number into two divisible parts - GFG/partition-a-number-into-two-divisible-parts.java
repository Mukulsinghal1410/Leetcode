// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String str[] = read.readLine().split(" ");
            String S= str[0];
            int a = Integer.parseInt(str[1]);
            int b = Integer.parseInt(str[2]);
            Solution ob = new Solution();
            System.out.println(ob.stringPartition(S,a,b));
        }
    }
}// } Driver Code Ends


class Solution
{
   static String stringPartition(String str, int a, int b)
   {
       
    int n=str.length();
       
       for(int i=1;i<n;i++){
           int num3=Integer.parseInt(str.substring(i,n));
           int num2=Integer.parseInt(str.substring(0,i));
           if(num2%a==0&&num3%b==0){
               String ans=str.substring(0,i);
               ans+=" ";
               ans+=str.substring(i,n);
               // System.out.println(i+" "+(n-i));
               return ans;
           }
       }
       return "-1";
   }
}