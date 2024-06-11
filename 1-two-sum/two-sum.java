class Solution {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        int l=0;int m=0;
        outer:
        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                if(nums[i]+nums[j] == target) {l=i;m=j;break outer;}
            }
        }
        int[] res = {l,m};
        return res;
    }
}