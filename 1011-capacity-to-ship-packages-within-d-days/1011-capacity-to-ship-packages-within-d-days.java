class Solution {
    public boolean helper(int mid, int[] nums, int days){
        int currsum=0;
        int count=1;
        for(int i=0;i<nums.length;i++){
            if(currsum+nums[i]>mid){
                count++;
                currsum=nums[i];
            }else{
                 currsum+=nums[i];


            }
        }

        if(count<=days){
            return true;
        }
        return false;
    }
    public int shipWithinDays(int[] nums, int days) {
        int low=Integer.MIN_VALUE;;
        int high=0;
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            high+=nums[i];
            low=Math.max(low,nums[i]);

        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(helper(mid,nums,days)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return ans;


        
    }
}