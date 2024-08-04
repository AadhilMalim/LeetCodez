class Solution {
    public int maximumDifference(int[] nums) {
        int len = nums.length;
        int maxdiff= 0;
        for(int i=0, j=1; j<len; j++){
            if(nums[j]<nums[i]){
                i=j;
            }
            int diff = nums[j] -  nums[i];
            if(maxdiff < diff) maxdiff = diff;
        }
        if(maxdiff==0) return -1;
        return maxdiff;
    }
}