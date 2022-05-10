// { Driver Code Starts
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
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int[] ans = obj.sortedArrayToBST(nums);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends

class Solution
{
    void formPreOrder(int i,int j,List<Integer> arr,int[] nums){
        if(i<=j){
            int x=i+((j-i)/2);
            arr.add(nums[x]);
            if(i!=j){
                formPreOrder(i,x-1,arr,nums);
                formPreOrder(x+1,j,arr,nums);
            }
        }
    }
    public int[] sortedArrayToBST(int[] nums)
    {
        int n=nums.length;
        List<Integer> arr=new ArrayList<>();
        formPreOrder(0,n-1,arr,nums);
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=arr.get(i);
        }
        return ans;
    }
}