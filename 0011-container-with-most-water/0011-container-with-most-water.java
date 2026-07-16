class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int n=height.length;
        int right=n-1;
        int max=0;

        while(left<=right){
            int len=Math.min(height[left],height[right]);

            int area=(right-left)*len;
            max=Math.max(max,area);

            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
        
    }
}