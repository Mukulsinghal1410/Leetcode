//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    int K = Integer.parseInt(element[1]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		    int res = obj.lenOfLongSubarr(arr, sizeOfArray, K);
		    
		    System.out.println(res);
		}
	}
}



// } Driver Code Ends


//User function Template for Java

class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int arr[], int n, int k) 
    {
        //Complete the function
         HashMap<Integer,Integer> mp = new HashMap<>(); // <Prefix,FirstOccur>
        
        int prefixSum = 0;
        int maxlen = 0;

        for(int i=0;i<n;i++)
        {
            prefixSum += arr[i];

            if(prefixSum == k)
            {
                maxlen = i+1;
            }
            // check if 'prefixSum - k' is present or not in map
            if(mp.containsKey(prefixSum - k))
            {
                // update maxlength
                if(maxlen < (i- mp.get(prefixSum - k))) 
                {
                    maxlen = i - mp.get(prefixSum - k);
                }
                // Or we can do this by not using upper if condition
                // maxlen = Math.max(maxlen,i - mp.get(prefixSum - k));
            }
            if(!mp.containsKey(prefixSum))
            {
                mp.put(prefixSum , i);
            }
        }
        return maxlen;
    }
}


