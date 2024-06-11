class Solution {

    public int[] twoSum(int[] nums, int target) {
         int len = nums.length;
         int i =0, j = 0;

         
         while(i<len){
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
            i++;
         }

         int[] result = {i,j};

         return result;
    }
}