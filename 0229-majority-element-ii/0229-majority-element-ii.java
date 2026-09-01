class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int ele1 = 0, ele2 = 0;
        int cnt1 = 0, cnt2 = 0;

        // Find candidates
        for (int num : nums) {

            if (num == ele1) {
                cnt1++;
            }
            else if (num == ele2) {
                cnt2++;
            }
            else if (cnt1 == 0) {
                ele1 = num;
                cnt1 = 1;
            }
            else if (cnt2 == 0) {
                ele2 = num;
                cnt2 = 1;
            }
            else {
                cnt1--;
                cnt2--;
            }
        }

        // Verify candidates
        int count1 = 0;
        int count2 = 0;

        for (int num : nums) {
            if (num == ele1) {
                count1++;
            }
            else if (num == ele2) {
                count2++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        if (count1 > nums.length / 3) {
            ans.add(ele1);
        }

        if (count2 > nums.length / 3) {
            ans.add(ele2);
        }

        return ans;
    }
}