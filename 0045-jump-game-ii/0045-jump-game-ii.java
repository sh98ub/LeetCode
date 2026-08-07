class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int jump=0;
        int farthest=0;
        int current=0;
        if(n<=1){
            return 0;
        }

        for(int i=0;i<n;i++){
           farthest=Math.max(nums[i]+i,farthest);

           if(farthest>=n-1){
            jump++;
            break;
           }
           if(i==current){
            
            
            jump++;
            current=farthest;
           }
          

        }
        return jump;
        
    }
}