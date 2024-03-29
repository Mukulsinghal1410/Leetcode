//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split("\\s+");
            int r = Integer.parseInt(str[0]);
            int c = Integer.parseInt(str[1]);
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                int k = 0;
                str = read.readLine().trim().split("\\s+");
                for(int j = 0; j < c; j++){
                  matrix[i][j] = Integer.parseInt(str[k]);
                  k++;
                }
            }
            Solution obj = new Solution();
            int[] p = obj.endPoints(matrix,r,c);
            out.print("(" +  p[0]+ ", " +  p[1]+ ")" +"\n");
        }
        out.close();
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    static int [] endPoints(int [][]arr, int n, int m)
    {
        //code here
        int i = 0 ;
        int j= 0 ;
        int dir = 0;
        int[] ans = new int[2];
        // 0 right
        // 1 left
        // 2 top
        // 3 bottom
        while( i >= 0 && j >= 0 && i < n && j < m)
        {
            if(arr[i][j] == 0)
            {
                ans[0] = i;
               ans[1] = j;
                if(dir == 0)
                {
                    j++;
                }else if(dir == 1)
                {
                    j--;
                }else if(dir == 2)
                {
                    i--;
                }else
                {
                    i++;
                }
            }else
            {
               ans[0] = i;
               ans[1] = j;
               arr[i][j] = 0;
               
               if(dir == 0)
               {
                    i++;
                    dir = 3;
                }else if(dir == 1)
                {
                    i--;
                    dir = 2;
                }else if(dir == 2)
                {
                    j++;
                    dir = 0;
                }else{
                    j--;
                    dir = 1;
                }
            }
        }
        return ans;
    }
}