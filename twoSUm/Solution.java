class Solution {
    public int[] twoSum(int[] nums, int target) {
        int firstNum = nums[0]; // Corrected spelling to "nums" instead of "num"
        int indexOne = 0;
        int indexTwo = 0; // Initialized indexTwo to 0
        int j = 1;
        int secondNum;
        boolean secondNumfound = false;
        int requiredValue = target - firstNum;

        // Added a condition to stop the loop when secondNum is found
        while (!secondNumfound && j < nums.length) {
            for (int i = 0+j; i < nums.length; i++) {
                if (requiredValue == nums[i]) {
                    secondNum = nums[i];
                    indexTwo = i;
                    secondNumfound = true;
                    break; // Added a break to exit the loop when the secondNum is found
                }
            }
            // Moved these lines inside the while loop to update values for the next iteration
            if (!secondNumfound) {
                firstNum = nums[j];
                indexOne = j;
                j++;
                requiredValue = target - firstNum;
            }
        }

        int[] result = {indexOne, indexTwo};
        return result;
    }
}