class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        int n=nums.length;

        for(int i=0;i<n-2;i++){
            int val=nums[i];
            if(i>0 && nums[i-1]==nums[i]){
                continue;
            }
            int left=i+1;
            int right=n-1;

            while(left<right){
                int sum=val+nums[left]+nums[right];

                if((val+nums[left]+nums[right])==0){
                    List<Integer> list=new ArrayList<>();
                    list.add(val);
                    list.add(nums[left]);
                    list.add(nums[right]);

                    result.add(list);

                    while(left<right && nums[left]==nums[left+1]){
                        left++;
                    }
                    while(left<right && nums[right]==nums[right-1]){
                        right--;
                    }

                    left++;
                    right--;
                }else if(sum>0){
                    right--;
                }else{
                    left++;
                }

            }
        }
        return result;
        
    }
}