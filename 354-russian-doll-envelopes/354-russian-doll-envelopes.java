class Solution 
{
    public int maxEnvelopes(int[][] envelopes) 
    {
        int n = envelopes.length, left, right, mid;
        // Sort array
        Arrays.sort(envelopes, new Comparator<int[]>() 
                    {
            public int compare(int[] a, int[] b) 
            {
                if (a[0] == b[0]) 
                {
                    return Integer.compare(b[1], a[1]);
                } else {
                    return Integer.compare(a[0], b[0]);
                }
            }
        });
        
        List<Integer> list = new ArrayList<>();
        list.add(envelopes[0][1]);
        
        for (int i=1; i<n; i++) {
            if (envelopes[i][1] > list.get(list.size() - 1)) {
                list.add(envelopes[i][1]);
            } else {
                // Find pos of first element which is >= current element
                left = 0; 
                right = list.size() - 1;
                while (left < right) {
                    mid = left + (right - left) / 2;
                    if (list.get(mid) >= envelopes[i][1]) {
                        right = mid;
                    } else {
                        left = mid + 1;
                    }
                }
                list.set(right, envelopes[i][1]);
            }
        }
        return list.size();
    }
}