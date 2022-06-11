// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            double a[] = new double[(int)(n)];
            double getAnswer[] = new double[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Double.parseDouble(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.nullPoints(n, a, getAnswer); 
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n-1;i++)
                output.append(String.format("%.2f", getAnswer[i])+" ");
                
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public void nullPoints(int n, double magnets[], double getAnswer[])
    {
        for (int i=0;i<n-1;i++){
           double l=magnets[i];
           double h=magnets[i+1];
           while (l<=h){
               double mid=(l+h)/2;
       
               double lf=0.00;
               double rf=0.00;
               for(int j = 0; j < n; j++){
                   if(j <= i){
                       lf += (double)1/(mid - magnets[j]);
                   }
                   else{
                       rf += (double)1/(magnets[j] - mid);
                   }
               }

               if(Math.abs(lf-rf) < 0.0000001){
                   getAnswer[i]=mid;
                   break;
               }
               if (lf<rf){
                   h=mid;
               }else {
                   l=mid;
               }
           }

       }
        // Your code goes here 
    }
}


