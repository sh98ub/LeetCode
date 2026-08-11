class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int count=1;

        int n=points.length;
        boolean flag=true;
        int prev=points[0][1];

        for(int i=1;i<n;i++){

            
             if(points[i][0]>prev){
                count++;
                prev=points[i][1];
                
            }else{
                prev=Math.min(prev,points[i][1]);
            }

        }
        return count;
        
    }
}