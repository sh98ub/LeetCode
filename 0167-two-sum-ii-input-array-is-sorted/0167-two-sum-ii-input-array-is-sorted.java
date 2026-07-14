class Solution {
    public int[] twoSum(int[] num, int target) {
        int result[]=new int[2];
        int left=0;
        int n=num.length;
        int right=n-1;

        while(left<=right){
            int val=num[left]+num[right];

            if(val==target){
                result[0]=left+1;
                result[1]=right+1;
                break;
            }else if(val<target){
                left++;
            }else{
                right--;
            }
        }
        return result;
        
    }
}