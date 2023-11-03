//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        HashMap<Integer,Integer> map = new HashMap<>(); //<PrefixSum ,FirstOccurence>
        int prefixSum = 0;
        int maxlen = 0;

        for(int i=0;i<arr.length;i++)
        {
            prefixSum += arr[i];
            if(prefixSum==0) 
            {
                maxlen = i+1; // it means we get prefixsum=0 and got maxlen
            }
            else{
                if(map.containsKey(prefixSum))
                {
                    maxlen = Math.max(maxlen, i - map.get(prefixSum));
                }
                else{
                    map.put(prefixSum,i);
                }
            }
        }
        return maxlen;
        // Your code here
    }
}