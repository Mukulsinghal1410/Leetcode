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
            int[][] grid = new int[n][n];
            for(int i = 0; i < n; i++){
                String[] S = br.readLine().trim().split(" ");
                for(int j = 0; j < n; j++){
                    grid[i][j] = Integer.parseInt(S[j]);
                }
            }
            Solution obj = new Solution();
            boolean ans = obj.is_Possible(grid);
            if(ans)
                System.out.println("1");
            else 
                System.out.println("0");
        }
    }
}// } Driver Code Ends



class Solution
{
    //Function to find whether a path exists from the source to destination.
    public boolean is_Possible(int[][] grid)
    {
        int si = -1, sj = -1, di = -1, dj = -1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    si = i;
                    sj = j;
                }
                if (grid[i][j] == 2) {
                    di = i;
                    dj = j;
                }
            }
        }
        
        boolean flag[][] = new boolean[grid.length][grid[0].length];
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {si, sj});
        
        int nbr[][]= new int[][] {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        
        while (!queue.isEmpty()) {
            int pos[] = queue.poll();
            if (pos[0] < 0 || pos[1] < 0 || pos[0] >= grid.length || pos[1] >= grid[0].length || flag[pos[0]][pos[1]] || grid[pos[0]][pos[1]] == 0) {
                continue;
            }
            
            flag[pos[0]][pos[1]] = true;
            
            if (pos[0] == di && pos[1] == dj) return true;
            
            for (int n[] : nbr) {
                queue.offer(new int[]{pos[0] + n[0], pos[1] + n[1]});
            }
        }
        
        return false;
    }
}