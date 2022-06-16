// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String str = br.readLine();
            
            Solution obj = new Solution();
            System.out.println(obj.findSubString(str));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    private static boolean allCovered(int arr[])
    {
        
        
        for(int i=0; i<128; i++)
        {
            if(arr[i]>0) return false;
        }
        
        return true;
    }
    
    public int findSubString( String str) {
        // Your code goes here
        
        char arr[] = str.toCharArray();
        
        int n = str.length();
        int map[] = new int[128];
        
        for(int i=0; i<n; i++)
        {
            map[arr[i]] = 1;
        }
        
        
        int l=0, r=0;
        
        int ans = n;
        while(r<n)
        {
            map[arr[r]]--;
            
            if(allCovered(map))
            {
                while(map[arr[l]]<0)
                {
                    map[arr[l]]++;
                    l++;
                }
                
                ans = Math.min(ans, r-l+1);
            }
            
            r++;
            
        }
        
        return ans;
        
    }
}