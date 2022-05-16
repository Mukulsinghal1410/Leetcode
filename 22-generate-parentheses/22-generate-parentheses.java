class Solution {
    public List<String> generateParenthesis(int n) 
    {
      List<String> list = new ArrayList<>();
		  Generate(n,0,0,"",list);
		  return list;
      
    }
  public static void Generate(int n, int opening, int closing, String ans, List<String> list) 
  {

		if(opening==n && closing==n) 
    {
			list.add(ans);
			return;
		}


		if(opening<n) 
    {
			Generate(n, opening+1, closing, ans+"(",list);
		}

		if(closing<opening) 
    {
			Generate(n, opening, closing+1, ans+")",list);
		}
	}
}