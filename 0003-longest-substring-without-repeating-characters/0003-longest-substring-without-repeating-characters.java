class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int n=s.length();
        HashSet<Character> set=new HashSet<>();
        int maxLen=0;

        for(int right=0;right<n;right++){
            char ch=s.charAt(right);

              while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
        }
        maxLen=Math.max(maxLen,  right-left+1);
        set.add(ch);
        }

        return maxLen;
        
    }
}