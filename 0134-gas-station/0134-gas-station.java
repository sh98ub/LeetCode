class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n=gas.length;
        int ans=0;
        int start=0;
        int total=0;

        for(int i=0;i<n;i++){
            total+=gas[i]-cost[i];


            ans+=gas[i]-cost[i];

            if(ans<0){
                start=i+1;
                ans=0;
            }

        }
        if(total<0) return -1;

        return start;
        
    }
}