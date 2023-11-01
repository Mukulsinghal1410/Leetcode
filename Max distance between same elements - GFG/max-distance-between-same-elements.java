//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			Solution ob = new Solution();
			System.out.println(ob.maxDistance(arr,n));
		
		t--;
		}
	}
}
// } Driver Code Ends


// your task is to complete this function
class Solution
{
    int maxDistance(int arr[], int n)
    {
        HashMap<Integer,Integer> mp = new HashMap<>(); // <element,FirstOccurenece>
        int maxD = 0;
        
        for(int i=0;i<n;i++)
        {
            if(!mp.containsKey(arr[i]))
            {
                mp.put(arr[i],i);
            }
            else
            {
                maxD = Math.max(maxD , i - mp.get(arr[i]));
            }
        }
        return maxD;
        
    }
}
