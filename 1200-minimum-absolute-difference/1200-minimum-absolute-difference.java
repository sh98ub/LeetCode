class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            min=Math.min(min,arr[i]-arr[i-1]);
        }
        List<List<Integer>> result=new ArrayList<>();

        for(int i=0;i<arr.length-1;i++){
            int val=arr[i+1]-arr[i];

            if(val==min){
                List<Integer> list=new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[i+1]);
                result.add(list);
            }

        }
        return result;

        
    }
}