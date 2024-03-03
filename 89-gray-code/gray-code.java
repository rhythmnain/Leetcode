class Solution {
    List<Integer> ans;
    HashSet<String> visited;
    public List<Integer> grayCode(int n) {
        visited = new HashSet();
        ans = new ArrayList();
        StringBuilder s = new StringBuilder();
        for(int i=0;i<n;i++)
          s.append('0');
        dfs(s,n);
        return ans;
    }
    void dfs(StringBuilder s,  int n)
    {
        if(visited.contains(s.toString()))
            return;
        visited.add(s.toString());
        ans.add(Integer.parseInt(s.toString(),2));
        for(int i=0;i<n;i++)
        {
           char or = s.charAt(i);
           char c = (or=='0')?'1': '0';
            s.setCharAt(i,c);
            if(!visited.contains(c))
                dfs(s,n);
            s.setCharAt(i,or);
        }
    }
}