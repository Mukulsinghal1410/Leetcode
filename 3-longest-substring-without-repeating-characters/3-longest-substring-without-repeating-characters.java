class Solution 
{
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) 
          return 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                max = Math.max(set.size(), max);
            }
            else {
                set.remove(s.charAt(j));
                --i;
                ++j;
            }
        }
        return max;
    }
    
}