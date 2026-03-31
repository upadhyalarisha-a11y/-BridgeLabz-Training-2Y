import java.util.*;

class Solution {
    public int longestSubarray(int[] nums, int limit) {

        // These will help us track max and min efficiently
        Deque<Integer> maxList = new LinkedList<>();
        Deque<Integer> minList = new LinkedList<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < nums.length; right++) {

            // Add current element to maxList (keep decreasing order)
            while (!maxList.isEmpty() && nums[maxList.peekLast()] < nums[right]) {
                maxList.removeLast();
            }
            maxList.addLast(right);

            // Add current element to minList (keep increasing order)
            while (!minList.isEmpty() && nums[minList.peekLast()] > nums[right]) {
                minList.removeLast();
            }
            minList.addLast(right);

            // If window becomes invalid, move left pointer
            while (nums[maxList.peekFirst()] - nums[minList.peekFirst()] > limit) {
                
                left++;

                // Remove elements that are out of the window
                if (maxList.peekFirst() < left) {
                    maxList.removeFirst();
                }
                if (minList.peekFirst() < left) {
                    minList.removeFirst();
                }
            }

            // Update answer
            int currentLength = right - left + 1;
            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }
}