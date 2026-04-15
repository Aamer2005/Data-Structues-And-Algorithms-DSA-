//problem 542 : https://leetcode.com/problems/01-matrix/

import java.util.*;

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        boolean[][] visited = new boolean[m][n];
        int[][] dist = new int[m][n];

        Queue<int[]> q = new LinkedList<>();

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(mat[i][j]==0)
                {
                    q.offer(new int[]{i,j,0});
                    visited[i][j] = true;
                }
            }
        }

        while(!q.isEmpty())
        {
            int[] arr = q.poll();
            int i = arr[0];
            int j = arr[1];
            int d = arr[2];

            int[] dx = {-1,1,0,0};
            int[] dy = {0,0,-1,1};

            for(int i1 = 0 , j1 = 0,count = 0 ; count<4;count++)
            {
                i1 = i+dx[count];
                j1 = j+dy[count];

                if(i1<0 ||j1<0 || i1>=m || j1>=n)continue;

                if(!visited[i1][j1])
                {
                    q.offer(new int[]{i1,j1,d+1});
                    visited[i1][j1] = true;
                    dist[i1][j1] = d+1;
                }
            }

        }

        return dist;
    }
}