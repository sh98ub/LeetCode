class Solution {
    public boolean helper(int mid, int[] nums, int k){
        long sum=0;

        for(int i=0;i<nums.length;i++){
sum += (nums[i] + mid - 1) / mid;      
  }

        if(sum<=k){
            return true;
        }
        return false;
    }
    public int minEatingSpeed(int[] piles, int h) {

       int low=1;
       int high=Integer.MIN_VALUE;

       for(int i=0;i<piles.length;i++){
       // low=Math.min(low,piles[i]);
        high=Math.max(high,piles[i]);
       }
       int ans=-1;

       while(low<=high){
        int mid=low+(high-low)/2;

        if(helper(mid,piles,h)){
            ans=mid;
            high=mid-1;

        }else{
            low=mid+1;
        }
       }
       return ans;

        
    }
}