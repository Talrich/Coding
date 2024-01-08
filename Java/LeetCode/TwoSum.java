class Solution {
    public int[] twoSum(int[] nums, int target) {
        int pos1 = 0; 
        int pos2 = pos1 + 1;
        int[] indices = new int[2];
        int i = 0;
        while (i < nums.length)
        {
            if (nums[pos1] + nums[pos2] == target)
            {
                indices[0] = pos1; 
                indices[1] = pos2; 
                return indices;
            }
            else if (pos2 < nums.length-1)
            {
                pos2++;
            }
            else
            {
                pos1++;
                pos2 = pos1+1;
            }
        }
        return indices;
    }
}