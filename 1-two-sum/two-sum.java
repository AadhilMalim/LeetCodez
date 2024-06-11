class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = nums.length;
        int i=0;int j=0;
        outer:
        for(i=0; i<l-1; i++){
            for(j=i+1; j<l; j++){
                if(nums[i]+nums[j] == target) break outer;
            }
        }
        int[] res = {i,j};
        return res;
    }
}