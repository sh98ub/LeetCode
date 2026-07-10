class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        int m=t.length();

        if(n<m){
            return "";
        }
        int minLen=Integer.MAX_VALUE;
        int startIdx=-1;
        int count=0;
        int left=0;
        int[] countS=new int[128];
        int[] countT=new int[128];

        for(int i=0;i<m;i++){
            countT[t.charAt(i)]++;
        }
        

        for(int right=0;right<n;right++){
            char ch=s.charAt(right);

            countS[ch]++;

            if(countT[ch]>0 && countS[ch] <=countT[ch]){
                count++;
            }


          if(count == m){

    while(countS[s.charAt(left)] > countT[s.charAt(left)]
          || countT[s.charAt(left)] == 0){

        if(countS[s.charAt(left)] > countT[s.charAt(left)]){
            countS[s.charAt(left)]--;
        }

        left++;
    }

    int windowLen = right - left + 1;

    if(windowLen < minLen){
        minLen = windowLen;
        startIdx = left;
    }
}



        }
                return (startIdx == -1) ? "" : s.substring(startIdx, startIdx + minLen);



    }
}