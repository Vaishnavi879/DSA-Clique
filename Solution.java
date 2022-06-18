class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==1) {
            return;
        }
        int l=0;
        int r=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==0 && nums[l]!=0) {
                l=i;
            }
            else if(nums[i]!=0) {
                r=i;
                // swap l and r
                if(nums[l]==0) {
                    int temp=nums[l];
                    nums[l]=nums[r];
                    nums[r]=temp;
                }
                while(nums[l]!=0 && l<r && l<nums.length-1) {
                    l++;
                }
            }
        }
    }
}
