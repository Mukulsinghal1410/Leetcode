class Solution {
    public List<List<Integer>> generate(int numRows) 
    {
      List<List<Integer>> list = new ArrayList<>();
      
      List<Integer> previous = null;
      List<Integer> rows = null;
      
      for(int i=0;i<numRows;i++)
      {
        rows = new ArrayList<Integer>();
      
        for(int j=0;j<=i;++j)
        {
          if(j==0 || j==i)
          {
            rows.add(1);
          }
          else
          {
            rows.add(previous.get(j-1) + previous.get(j));
          }
          
       }
        previous = rows;
        list.add(rows);
      }
      return list;
        
    }
}