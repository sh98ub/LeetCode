class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        Stack<Integer> st=new Stack<>();
     
        int ans=0;

        for(int i=0;i<n;i++){

            if(!st.isEmpty() && nums[st.peek()]>nums[i]){
                return st.peek();
                
            }
            st.push(i);
        }

        return n-1;

       
        
    }
}