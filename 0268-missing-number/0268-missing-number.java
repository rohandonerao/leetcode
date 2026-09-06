class Solution {

    public int missingNumber(int[] nums) {

        int xor = nums.length;

        for (int i = 0; i < nums.length; i++) {

            // XOR with expected number
            xor ^= i;

            // XOR with actual number
            xor ^= nums[i];
        }

        return xor;
    }
}