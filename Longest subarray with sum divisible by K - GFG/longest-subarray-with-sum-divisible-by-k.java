// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java

class Solution{
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
 
        int sum = 0;
        for (int i = 0; i < n; i++) 
        {
            sum += a[i];
            // to handle negavtive values as well
            int mod = ((sum % k) + k) % k;
 
            // this will be the longest possible length from
            // start
            if (mod == 0)
            {
                max = i + 1;
            }
 
            if (!map.containsKey(mod))
            {
                map.put(mod, i);
            }
            else 
            {
                int sz = i - map.get(mod);
                max = Math.max(max, sz);
            }
        }
 
        return max;
    }
 
}


// { Driver Code Starts.

// Driver class
class GFG {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    
		    String line1 = br.readLine();
		    String[] element = line1.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    int K = Integer.parseInt(element[1]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		   
		    int res = obj.longSubarrWthSumDivByK(arr, sizeOfArray, K);
		    
		    System.out.println(res);
		    
		    
		}
	}
}


  // } Driver Code Ends