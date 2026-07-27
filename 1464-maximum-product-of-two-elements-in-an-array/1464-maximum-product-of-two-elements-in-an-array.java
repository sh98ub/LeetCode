class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int max=0;
        for(int i=1;i<n;i++){
            max=Math.max(max,(nums[i-1]-1)*(nums[i]-1));
        }
        return max;
        
    }
}