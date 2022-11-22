//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            String[] S = s.split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            int ans = ob.countTriplets(nums);
            System.out.println(ans);         
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int countTriplets(int[] nums)
    {
        int ans=0;
        int n=nums.length;
        for(int i=1;i<n-1;i++)
        {
            int less=0,more=0;
            
            // number of smaller elements before nums[i]

            for(int j=i-1;j>=0;j--)
            {
                if(nums[i]>nums[j]) less++;
            }
            // number of larger elements before nums[i]

            for(int k=i+1;k<n;k++)
            {
                if(nums[i]<nums[k]) more++;
            }
            ans=ans+(less*more);
        }
        return ans;
    }
}