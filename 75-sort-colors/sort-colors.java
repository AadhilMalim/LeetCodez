class Solution {
    public void sortColors(int[] nums) {
        int len = nums.length;
        int one=0,two=0,zero=0;
        for(int i=0; i<len;i++){
            if(nums[i]==0)zero++;
            else if(nums[i]==1) one++;
            else two++;
        } 
        for(int i=0; i<len; i++){
            if(zero != 0){
                nums[i]=0;
                zero--;
            }else if(one!=0){
                nums[i] = 1;
                one--;
            }else nums[i] = 2;
        }
        // outer:
        // for(int i=0;i<len;i++){
        //     int min = nums[i];int k=i;
        //     inner:
        //     for(int j=i+1; j<len;j++){
        //         if(nums[j]<min){
        //             min = nums[j];
        //             k=j;
        //         }
        //     }
        //     if(min<nums[i]){
        //         nums[k] = nums[i];
        //         nums[i] = min;
        //     }
        // }
    }
}