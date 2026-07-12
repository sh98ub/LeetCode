class Solution {
    public boolean helper(int[] countS, int[] countP ){
        for(int i=0;i<countS.length;i++){
            if(countS[i]!=countP[i]){
                return false;
            }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        int m=p.length();
        List<Integer> list=new ArrayList<>();

        if(n<m){
            return list;
        }
        int[] countP=new int[128];
        int[] countS=new int[128];
        for(int i=0;i<m;i++){
            char ch=p.charAt(i);
            countP[ch]++;
        }
        int left=0;

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            countS[ch]++;

             while((i-left+1)>m){
                char ch1=s.charAt(left);
                countS[ch1]--;
                left++;
            }

            if((i-left+1)==m){

                if(helper(countS, countP)){
                    list.add(left);
                }

            }
           
        }
        return list;
        
    }
}