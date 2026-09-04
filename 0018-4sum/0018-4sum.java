class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < nums.length - 2; j++) {

                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int li = j + 1;
                int ri = nums.length - 1;

                while (li < ri) {

                    long sum = (long) nums[i] + nums[j] + nums[li] + nums[ri];

                    if (sum < target) {
                        li++;
                    }
                    else if (sum > target) {
                        ri--;
                    }
                    else {
                        res.add(Arrays.asList(
                            nums[i], nums[j], nums[li], nums[ri]
                        ));

                        while (li < ri && nums[li] == nums[li + 1]) {
                            li++;
                        }

                        while (li < ri && nums[ri] == nums[ri - 1]) {
                            ri--;
                        }

                        li++;
                        ri--;
                    }
                }
            }
        }

        return res;
    }
}