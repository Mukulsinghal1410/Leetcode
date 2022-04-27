class Solution {
    
    int findPar(int u, int par[]){
        if(par[u]==u) return u;
        return par[u] = findPar(par[u],par);
    }
    
    void union(int u, int v, int par[], int rank[]){
        u = findPar(u,par);
        v = findPar(v,par);
        if(rank[u]>rank[v]){
            par[v] = u;
        }else if(rank[v]>rank[u]){
            par[u] = v;
        }else{
            par[u] = v;
            rank[v]++;
        }
    }
    
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        int n = s.length();
        int par[] = new int[n];
        for(int i=0;i<n;i++) par[i] = i;
        int rank[] = new int[n];
        for(List<Integer> lst: pairs) union(lst.get(0),lst.get(1),par,rank);
        Map<Integer,PriorityQueue<Character>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(findPar(i,par))) map.put(findPar(i,par),new PriorityQueue<>());
            map.get(findPar(i,par)).offer(s.charAt(i));
        }
        String ans = "";
        for(int i=0;i<n;i++) ans += map.get(findPar(i,par)).poll();
        return ans;
    }
}