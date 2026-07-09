class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr=new int[26];
       int  maxfreq=0;
       int maxlen=0;
       int left=0;
       int n=s.length();

       for(int i=0;i<n;i++){
       int val= arr[s.charAt(i)-'A']++;
        maxfreq=Math.max(val+1,maxfreq);

        while(((i-left+1)-maxfreq)>k){
            arr[s.charAt(left)-'A']--;
            left++;
        }

        maxlen=Math.max(maxlen,i-left+1);


       }

       return maxlen;

        
    }
}