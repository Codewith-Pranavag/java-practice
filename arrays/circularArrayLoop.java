class Solution {
    
    private int nextIndex(int[] nums, int curr) {
        int n = nums.length;
        return ((curr + nums[curr]) % n + n) % n;
    }

    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            if (nums[i] == 0) continue;

            boolean forward = nums[i] > 0;

            int slow = i;
            int fast = i;

            while (true) {

                int nextSlow = nextIndex(nums, slow);

                if ((nums[nextSlow] > 0) != forward)
                    break;

                int nextFast = nextIndex(nums, fast);

                if ((nums[nextFast] > 0) != forward)
                    break;

                nextFast = nextIndex(nums, nextFast);

                if ((nums[nextFast] > 0) != forward)
                    break;

                slow = nextSlow;
                fast = nextFast;

                if (slow == fast) {

                    // length 1 cycle is invalid
                    if (slow == nextIndex(nums, slow))
                        break;

                    return true;
                }
            }

            // Mark visited nodes as 0
            int curr = i;

            while (nums[curr] != 0 && (nums[curr] > 0) == forward) {
                int next = nextIndex(nums, curr);
                nums[curr] = 0;
                curr = next;
            }
        }

        return false;
    }
}
