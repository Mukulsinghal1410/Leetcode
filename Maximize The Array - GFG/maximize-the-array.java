// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

public class GFG {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr1 = new int[n], arr2 = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr1[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr2[i] = Integer.parseInt(inputLine[i]);
            }

            ArrayList<Integer> ans = new Solution().maximizeArray(arr1, arr2, n);
            for (Integer x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
   ArrayList<Integer> maximizeArray(int[] arr1, int[] arr2, int n) {
       // code her
       TreeMap<Integer,Integer> tm1=new TreeMap<>(Collections.reverseOrder());
       TreeMap<Integer,Integer> tm2=new TreeMap<>();
       ArrayList<Integer> ans=new ArrayList<>();
       int c=0;
       for(int i=0;i<n;i++){
           if(tm1.get(arr2[i])==null){
               tm1.put(arr2[i],c);
               ++c;
           }
       }
       for(int i=0;i<n;i++){
           if(tm1.get(arr1[i])==null){
               tm1.put(arr1[i],c);
               ++c;
           }
       }
       int i=0;
       for(Integer k:tm1.keySet()){
           if(i==n) break;
           tm2.put(tm1.get(k),k);
           ++i;
       }
       for(Integer l:tm2.keySet()){
           ans.add(tm2.get(l));
       }
       return ans;
   }
}
