// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        PrintWriter out = new PrintWriter(System.out);
        
        int t = Integer.parseInt(br.readLine()); 

        while(t > 0){
        	int N = Integer.parseInt(br.readLine()); 
        	int[] Arr = new int[N];
        	String line = br.readLine(); 
            String[] strs = line.trim().split("\\s+"); 
        	for(int i=0; i<N; i++)
        	{
        		Arr[i] = Integer.parseInt(strs[i]); 
        	}
        	

            Solution ob = new Solution();
			int[] ans = ob.farNumber(N,Arr);
  
            for(int i=0; i<ans.length; i++)
                out.print(ans[i] + " ");
            out.println();

            t--;
        }
        out.flush();
    } 
} 
// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static int[] farNumber(int N, int arr[])
	{
	    int first = 0;
	    int last = N-1;
	    int[] res = new int[N];
	    Arrays.fill(res,-1);
	    while(last>=first)
	    {
	        if(arr[first]>arr[last])
	        {
	            res[first] = last;
	            first++;
	            last = N-1;
	        }
	        else
	        {
	            last--;
	        }
	        if(first == last)
	        {
	            first++;
	            last = N-1;
	        }
	    }
	    return res;
	}
} 