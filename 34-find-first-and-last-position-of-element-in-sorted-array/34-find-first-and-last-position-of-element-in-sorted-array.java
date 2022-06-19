class Solution 
{
    public int[] searchRange(int[] nums, int target) 
    {
        int[] ans = {-1, -1};
        
        if(nums.length == 0)
            return ans;
        
        ans[0] = bsearch(nums, target, true);
        ans[1] = bsearch(nums, target, false);
        return ans;
    }
    
    static int bsearch(int[] nums, int target, boolean findStartIndex)
    {
        int start = 0, end = nums.length - 1;
        int index = -1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            
            if(target > nums[mid])
                start = mid + 1;
            else if(target < nums[mid])
                end = mid - 1;
            else
            {
                index = mid;
                if(findStartIndex)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        
        return index;
    }
    
}