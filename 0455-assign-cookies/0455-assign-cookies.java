class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int count=0;
        int i=0;
        int idx=0;
        while(i<g.length && idx<s.length){
            if(s[idx]>=g[i]){
                count++;
                idx++;
                i++;
            }else{
                idx++;
            }
        }

        return count;
        
    }
}