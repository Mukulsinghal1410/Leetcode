class Solution {
    public boolean hasAllCodes(String s, int k) {
       Set<String> codesSet = new HashSet<>();
        int i = 0, j = 0;
        while(i<=s.length() && i+k<=s.length()){
            j = i+k;
            codesSet.add(s.substring(i, j));
            i++;
        }
        return codesSet.size() == (int)Math.pow(2,k);
    }
}