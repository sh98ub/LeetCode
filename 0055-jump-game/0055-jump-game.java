class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        if(n<=1) return true;
        int max=0;

   

        for(int i=0;i<n-1;i++){
            int val=nums[i];
            max=Math.max(max,val+i);

            if(nums[i]==0){
                if(i>=max){
                    return false;
                }
            }

            if(i+val>=n-1){
                return true;
            }
        }
        return false;




        
    }
}