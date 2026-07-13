class Solution {
    public int totalFruit(int[] arr) {
        int maxLen=0;
        int n=arr.length;
        int left=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<n;i++){
            int val=arr[i];
            map.put(val, map.getOrDefault(val,0)+1);

            while(map.size()>2){
                int val1=arr[left];
                map.put(val1,map.get(val1)-1);

                if(map.get(val1)==0){
                    map.remove(val1);
                }
                left++;
            }
            maxLen=Math.max(maxLen,i-left+1 );
        }
        return maxLen;
        
    }
}