class Solution {
	public List<List<String>> groupAnagrams(String[] strs) {
		int n = strs.length;

		HashMap<String,ArrayList<String>> map = new HashMap<>();
		for(int i=0;i<strs.length;i++){
			char[] tmp = strs[i].toCharArray();
			Arrays.sort(tmp);
			String t = new String(tmp);

			if(map.containsKey(t)){
				ArrayList<String> list = map.get(t);
				list.add(strs[i]);
				map.put(t,list);
			}else{
				ArrayList<String> list = new ArrayList<>();
				list.add(strs[i]);
				map.put(t,list);
			}

		}

		return new ArrayList(map.values());
	}
}