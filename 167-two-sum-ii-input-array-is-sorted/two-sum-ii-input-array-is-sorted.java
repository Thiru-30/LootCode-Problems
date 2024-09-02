class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] {left + 1, right + 1};  // returning 1-based indices
            } else if (sum < target) {
                left++;  // move left pointer to the right
            } else {
                right--;  // move right pointer to the left
            }
        }
        
        // If no solution is found, though the problem guarantees one.
        return new int[] {-1, -1}; 
    }
}
