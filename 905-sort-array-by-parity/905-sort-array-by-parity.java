class Solution {
    public int[] sortArrayByParity(int[] nums) 
    {
      int l=nums.length;
      int a =0;
      int b=l-1;
      while(a<b)
      {
        if(nums[a]%2==0)
        {
          a++;
        }
        else if(nums[a]%2!=0)
        {
          int temp=nums[a];
          nums[a] = nums[b];
          nums[b] = temp;
          b--;
        }
      }
      return nums;
        
    }
}