class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) 
    {
      List<Boolean> li = new ArrayList<>();
      int max = 0;
      for(int element : candies)
      {
        if(max < element)
          max = element;
      }
      for(int i=0;i<candies.length;i++)
      {
        if(candies[i] + extraCandies >= max)
        {
          li.add(true);
        }
        else
          li.add(false);
      }
      return li;
        
    }
}