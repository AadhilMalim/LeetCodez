class Solution {

    public int[] twoSum(int[] nums, int target) {
         int len = nums.length;
         int l =0, k = 0;

         outer:
         for(int i=0;i<len;i++){
            inner:
            for(int j=i+1;j<len;j++){
                if(nums[i]+nums[j]==target){
                    l = i; k = j;
                    break outer;
                }
            }
         }

         int[] result = {l,k};

         return result;
    }
}