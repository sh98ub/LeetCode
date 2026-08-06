class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        int n=nums.length;

        for(int i= n-1;i>=2;i--){
            if(nums[i]<(nums[i-1]+nums[i-2])){
                int val=nums[i]+nums[i-1]+nums[i-2];
                max=Math.max(val,max);


            }
        }
        return max;

        
    }
}