class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        if(n<=1){
            return s;
        }

        String str="";
        

        for(int i=0;i<(n)/2;i++){
            str+=s.charAt(i);
        }
        char[] arr=str.toCharArray();

        Arrays.sort(arr);
        String str1=new String(arr);

       // String ans=str1;

        StringBuilder ans=new StringBuilder(str1);
        if (n % 2 == 1) {
            ans.append( s.charAt(n / 2));
        }
        for (int i = str1.length() - 1; i >= 0; i--) {
    ans.append(str1.charAt(i));
}


            

        

        return ans.toString();


       

        
        
    }
}