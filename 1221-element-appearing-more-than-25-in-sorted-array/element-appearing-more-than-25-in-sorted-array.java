// Approach 2: Direct Window Jump
class Solution {
    public int findSpecialInteger(int[] arr) {
        int gap = arr.length / 4;

        for (int i = 0; i < arr.length - gap; i++) {
            if (arr[i] == arr[i + gap]) {
                return arr[i];
            }
        }

        return -1;
    }
}