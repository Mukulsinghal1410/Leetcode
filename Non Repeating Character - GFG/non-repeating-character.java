//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String st = sc.next();
            
            char ans=new Solution().nonrepeatingCharacter(st);
            
            if(ans!='$')
            System.out.println(ans);
            else
            System.out.println(-1);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find the first non-repeating character in a string.
    // static char nonrepeatingCharacter(String S)
    // {
    //     if(S == null || S.length() == 0)
    //         return '$';

    //     //Your code here
    //     HashMap<Character,Integer> st = new HashMap<>();
    //     for(int i=0;i<S.length();i++)
    //     {
    //         st.put(S.charAt(i),st.getOrDefault(S.charAt(i),0)+1);
    //     }
    //     for(int i=0; i<S.length(); i++)
    //     {
    //         if(st.get(S.charAt(i)) ==1)
    //         {
    //             return S.charAt(i);
    //         }
    //     }
    //     return '$';
    // }
    static char nonrepeatingCharacter(String str)
    {
        int n = str.length();
        if(str == null || str.length() == 0)
            return '$';
        
        HashMap<Character, Integer> mp = new HashMap<>();
        for(char ch : str.toCharArray()) 
        {
            mp.put(ch, mp.getOrDefault(ch, 0)+1);
            //System.out.println(mp);
        }
        for(int i=0; i<str.length(); i++)
        {
            if(mp.get(str.charAt(i)) ==1)
            {
                return str.charAt(i);
            }
        }
        return '$';
    }

}

