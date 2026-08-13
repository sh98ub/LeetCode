class Solution {
    public int candy(int[] nums) {

        int n = nums.length;
        int[] candy = new int[n];

        // Left -> Right
        candy[0] = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                candy[i] = candy[i - 1] + 1;
            } else {
                candy[i] = 1;
            }
        }

        // Right -> Left
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > nums[i + 1]) {
                candy[i] = Math.max(candy[i], candy[i + 1] + 1);
            }
        }

        int sum = 0;

        for (int c : candy) {
            sum += c;
        }

        return sum;
    }
}