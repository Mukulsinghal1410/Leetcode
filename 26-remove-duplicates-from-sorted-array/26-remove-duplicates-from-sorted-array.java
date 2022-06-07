class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Input is invalid");
        }

        int len = nums.length;
        if (len <= 1) {
            return len;
        }

        int insertPos = 0;
        for (int i = 1; i < len; i++) {
            if (nums[i] != nums[insertPos]) {
                nums[++insertPos] = nums[i];
            }
        }

        return insertPos + 1;
    }
}