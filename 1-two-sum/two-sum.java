class Solution {

    public int[] twoSum(int[] nums, int target) {
         int len = nums.length;
         int i =0, j = 0;

         
         for( i=0;i<len;i++){
            int sum =0;
            for( j=i+1;j<len;j++){
                sum = nums[i]+nums[j];
                if(sum==target){
                    break;
                }
            }
            if(sum==target){
                    break;
                }
         }

         int[] result = {i,j};

         return result;
    }
}