class Solution {

    public boolean helper(int mid, int[] nums, int k){

        int count=1;
        int sum=0;
        for(int i=0;i<nums.length;i++){

            if(sum+nums[i]>mid){
                count++;
                sum=nums[i];
            }else{
                sum+=nums[i];
            }

        }

        return count<=k;
    }
    public int splitArray(int[] nums, int k) {

        int low=Integer.MIN_VALUE;

        int high=0;

        for(int i=0;i<nums.length;i++){
            low=Math.max(low,nums[i]);
            high+=nums[i];
        }
        int ans=-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(helper(mid,nums,k)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return ans;



        
    }
}