class Solution {
    public boolean isValid(String s) 
    {
      Stack<Character> visit = new Stack<>();
      for(int i=0;i<s.length();i++)
      {
        char curr = s.charAt(i);
        if(curr=='[' || curr=='{' ||curr=='(')
        {
          visit.push(curr);
        }
        else if(curr==']' ||curr=='}' || curr==')')
        {
          if(visit.isEmpty())
          {
            return false;
          }
          char topch = visit.pop();
          if(curr==')' && topch == '(')
            continue;
          if(curr=='}' && topch == '{')
            continue;
          if(curr==']' && topch == '[')
            continue;
          return false;
        }
      }
      if(!visit.isEmpty())
      {
        return false;
      }
      return true;
    }
}