class Solution {
    class Pair{
        String key;
        double val;
        
        public Pair(String k,double v){
            key = k;
            val = v;
        }
    }
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String,List<Pair>> g = buildGraph(equations,values);
        
        double[] result = new double[queries.size()];
        for(int i=0;i<queries.size();i++)
          result[i] = dfs(queries.get(i).get(0),queries.get(i).get(1),new HashSet(),g);
        
        return result;
        
    }
    
    private double dfs(String s, String d, Set<String> visited,Map<String,List<Pair>>g)
    {
        if(!(g.containsKey(s) && g.containsKey(d)))
            return -1.0;
        if(s.equals(d))
            return 1.0;
        visited.add(s);
        for(Pair p:g.get(s))
        {
            if(!visited.contains(p.key))
            {
                double ans = dfs(p.key,d,visited,g);
                if(ans!= -1.0)
                    return ans*p.val;
            }
        }
        
        return -1.0;
    }
    
    private Map<String,List<Pair>> buildGraph(List<List<String>>eq,double[] values)
    {
        Map<String,List<Pair>> g = new HashMap();
        
        for(int i=0;i<values.length;i++)
        {
            String src = eq.get(i).get(0);
            String des = eq.get(i).get(1);
            
            g.putIfAbsent(src,new ArrayList());
            g.putIfAbsent(des,new ArrayList());
            g.get(src).add(new Pair(des,values[i]));
            g.get(des).add(new Pair(src,1/values[i]));
        }
        
        return g;
    }
}