// top = 0, bottom = rows-1

// left = 0, right = cols-1
// Repeat:

// left → right along top, then top++

// top → bottom along right, then right--

// right → left along bottom if top <= bottom, then bottom--

// bottom → top along left if left <= right, then left++
// Stop when top > bottom or left > right.

// Time: O(m·n), Space: O(1) extra (besides output).

//LeetCode Problem No : 54

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        java.util.List<Integer> list = new java.util.ArrayList<>();

        int left = 0 , right = matrix[0].length-1;  //right = last column
        int top = 0 , bottom = matrix.length-1;     //bottom = last row

        while(left<=right && top <= bottom)
        {
            for(int i=left;i<=right;i++)
            {
                list.add(matrix[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++)
            {
                list.add(matrix[i][right]);
            }
            right--;

            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }

        return list;
        
    }
}