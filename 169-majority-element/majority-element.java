class Solution {
    public int majorityElement(int[] nums) {
        for(int i=0;i<=nums.length/2;i++){
            int min = nums[i];
            int k=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]<min){ min=nums[j]; k=j;}
            }
            if(i!=k){
                int temp=nums[i];
                nums[i] = nums[k];
                nums[k] =  temp;
            }
        }
    //    System.out.println(nums.length);
        return nums[nums.length/2];
        // return 0;
    }
}