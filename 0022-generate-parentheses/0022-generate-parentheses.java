class Solution {
    private List<String> s = new ArrayList<>();
    private int n;

    public List<String> generateParenthesis(int n) {
        this.n=n;
        dfs(0,0,"");
        return s;    
    }

    private void dfs(int l, int r, String t) {
        if(l>n || r>n || l<r){
            return;
        }
        if(l==n && r==n){
            s.add(t);
            return;
        }
        dfs(l+1,r,t+"(");
        dfs(l,r+1,t+")");
    }
}