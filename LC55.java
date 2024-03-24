class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1) return true;
        int range = nums[0];
        for(int i = 0; i <= range; i++){
            range = Math.max(range, i + nums[i]);
            if(range >= nums.length - 1) return true;
        }
        return false;
    }
}
// O(N), O(1)
