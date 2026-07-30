class Solution {
    public boolean lemonadeChange(int[] bills) {
        int count1=0;
        int count2=0;

        for(int i=0;i<bills.length;i++){
            int val=bills[i];

            if(val==5){
                count1++;
            }else if(val==10){
                if(count1>0){
                count2++;
                count1--;
                }else{
                    return false;
                }

            }else if(val==20) {
                if(count1>0 && count2>0){
                    count1--;
                    count2--;

                }else if(count2==0 && count1>=3){
                    count1=count1-3;
                    
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}