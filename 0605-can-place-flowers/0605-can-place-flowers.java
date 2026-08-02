class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        boolean flag=false;
        int count=0;

        for(int i=0;i<arr.length-1;i++){
            if(i==0 && arr[i]==0 && arr[i+1]==0){
                count++;
                arr[i]=1;
                flag=true;
            }

        

            if(arr[i]==1){
                flag=true;
            }
             if(arr[i]==0){
             if (flag==false && arr[i+1]==0){
                arr[i]=1;

                count++;
                flag=true;
             }else{
                flag=false;
             }
               
            }

        }
        if(flag==false && arr[arr.length-1]==0){
            count++;
        }

        return count>=n;
        
    }
}