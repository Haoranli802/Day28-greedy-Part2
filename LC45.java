class Solution {
    public int jump(int[] nums) {
        if(nums.length == 1) return 0;
        int maxRange = nums[0];
        int range = nums[0];
        int count = 0;
        for(int i = 0; i <= range; i++){
            maxRange = Math.max(maxRange, i + nums[i]);
            if(i == range){
                range = maxRange;
                count ++;
            }
            if(range >= nums.length - 1) return count + 1;
            //if(i == nums.length - 1) break;
        }
        return count;
    }
}
//O(N), O(1)
