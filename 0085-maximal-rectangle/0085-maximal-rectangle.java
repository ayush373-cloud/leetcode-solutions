import java.util.*;

class Solution {
    public int maximalRectangle(char[][] matrix) {

        if (matrix.length == 0)
            return 0;

        int n = matrix[0].length;
        int[] heights = new int[n];
        int maxArea = 0;

        for (int i = 0; i < matrix.length; i++) {

            // build histogram for this row
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1')
                    heights[j]++;
                else
                    heights[j] = 0;
            }

            maxArea = Math.max(maxArea, largestRectangle(heights));
        }

        return maxArea;
    }

    int largestRectangle(int[] heights) {

        Stack<Integer> st = new Stack<>();
        int max = 0;

        for (int i = 0; i <= heights.length; i++) {

            int curr = (i == heights.length) ? 0 : heights[i];

            while (!st.isEmpty() && curr < heights[st.peek()]) {

                int h = heights[st.pop()];
                int right = i;
                int left = st.isEmpty() ? -1 : st.peek();

                max = Math.max(max, h * (right - left - 1));
            }

            st.push(i);
        }

        return max;
    }
}