class Solution {
    public List<Integer> findDuplicates(int[] nums) 
    {
       ArrayList<Integer> result = new ArrayList<>();
      
        for (int i = 0; i < nums.length; i++) 
        {
            int index = Math.abs(nums[i])-1;
          
            if (nums[index] < 0)
            {
                result.add(Math.abs(index+1));
            }
          
            nums[index] = -1 * nums[index];
        }
        return result ;
    }
}