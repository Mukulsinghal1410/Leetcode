public class Solution {
    public int minDistance(String A, String B) {
        
        int m = A.length();
        int n = B.length();
        int t[][] = new int[m+1][n+1];
        
        for(int i = 0;i<=m;i++){
            for(int j = 0; j<=n; j++){
// since first word is empty, there would be insertions equal to length of second string
                if(i==0)
                {
                    t[i][j] = j;
// since second word is empty, there would be insertions equal to length of first string
                } else if (j==0) 
                {
                    t[i][j] = i;
                }
            }
        }

        for(int i = 1; i<=m ; i++){
            for(int j = 1; j<=n; j++){
                if(A.charAt(i-1) == B.charAt(j-1)){
                    t[i][j] = t[i-1][j-1];
                  
// do nothing, if characters are same, just copy previous value
                } 
              else 
              {
                
 // deletion in one string or insertion in another string is same thing
// assume we are doing all changes in first string only(same could be thought for second string as well)
// so if different, find min of
                
// t[i-1][j]   --> I will insert the (j-1)th character into first string
// t[i][j-1]   --> I will delete the (i-1)th character from first string
 // t[i-1][j-1] --> I will replace the (i-1)th character into first string
//(above operations are not actually done on string, we just count the operations)4
                
                t[i][j] = 1 + Math.min(t[i-1][j], Math.min(t[i][j-1],t[i-1][j-1]));
                }
            }
        }
        return t[m][n]; 

    }
}