// { Driver Code Starts
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
            int[][] matrix = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++)
                    matrix[i][j] = Integer.parseInt(S[j]);
            }
            Solution ob = new Solution();
            int[][] ans = ob.ShortestDistance(matrix);
            for(int i = 0; i < ans.length; i++){
                for(int j = 0; j < ans[i].length; j++){
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
// } Driver Code Ends


class Solution{
   
    boolean maze(int i,int j,int [][]matrix,int[][]ans){
        if(i==matrix.length-1 && j==matrix.length-1){
            //for ending
            ans[i][j]=1;
            return true;
        }
        if(i<matrix.length && j<matrix.length && matrix[i][j]!=0){
            // for checking boundary
           
            for(int k=1;k<=matrix[i][j];k++){
                //traversing minimum to maximum steps in matrix[i][j]
                if(maze(i,j+k,matrix,ans)||maze(i+k,j,matrix,ans)){
                    ans[i][j]=1;
                    return true;}
                
            }
            return false;
       
           
        }
        return false;
    }
    public int[][] ShortestDistance(int[][] matrix){
        int [][] ans=new int[matrix.length][matrix.length];
        // ans.addAll(0);
        if(maze(0,0,matrix,ans))
        return ans;
        return new int[][]{{-1}};
       
    }
}