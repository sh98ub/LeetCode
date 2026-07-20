class Solution {
    public int findPeakElement(int[] nums) {

        int left=0;
        int n=nums.length;
        int  right=n-1;
        int ans=-1;

        while(left<right){
            int mid=left+(right-left)/2;

            if(nums[mid]<nums[mid+1]){
                left=mid+1;
            }else{
              
                right=mid;
            }
        }
        return left;
        
    }
}