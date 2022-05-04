class Solution
{
  public int maxOperations(int[] nums, int k) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            int diffVal = k - num;
            if (map.containsKey(diffVal) && map.get(diffVal) > 0) {
                count++;
                map.merge(diffVal, -1, Integer::sum);
            } else {
                map.merge(num, 1, Integer::sum);
            }
        }
        return count;
    }
}
