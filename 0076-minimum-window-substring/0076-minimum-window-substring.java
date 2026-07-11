class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        int m=t.length();

        int[] countS=new int[128];
        int[] countT=new int[128];

        if(n<m){
            return "";
            
        }
        int minLen=Integer.MAX_VALUE;
        int count=0;

        for(int i=0;i<m;i++){
            countT[t.charAt(i)]++;
        }
    
        int left=0;
        int ans=-1;

        for(int i=0;i<n;i++){
            char ch=s.charAt(i);

            countS[ch]++;

        if(countT[ch]>0 && countS[ch]<= countT[ch]){
                count++;

            }
            if(count==m){
                while((countS[s.charAt(left)]> countT[s.charAt(left)])|| countT[s.charAt(left)]==0){
                    if((countS[s.charAt(left)]> countT[s.charAt(left)])){
                        countS[s.charAt(left)]--;
                      
                    }
                      left++;
                }

                    int winLen=i-left+1;

                    if(winLen<minLen){
                        minLen=winLen;
                        ans=left;
                    }
            }

        }

                return (ans == -1) ? "" : s.substring(ans, ans+ minLen);

        
    }
}