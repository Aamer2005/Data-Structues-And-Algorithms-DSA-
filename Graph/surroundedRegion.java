class Solution {
    public void solve(char[][] board) {

        int m = board.length;
        int n = board[0].length;

        boolean[][] visited = new boolean[m][n];


        //for row traversal
        for(int j=0;j<n;j++)
        {
            if(!visited[0][j] && board[0][j]=='O')
            {
                dfs(board , 0,j ,visited);
            }

            if(!visited[m-1][j] && board[m-1][j]=='O')
            {
                dfs(board ,m-1,j ,visited);
            }
        }

         for(int i=1;i<m-1;i++)
        {
            if(!visited[i][0] && board[i][0]=='O')
            {
                dfs(board , i,0 ,visited);
            }

            if(!visited[i][n-1] && board[i][n-1]=='O')
            {
                dfs(board ,i,n-1 ,visited);
            }
        }

        for(boolean[] arr : visited)
        {
            System.out.println(Arrays.toString(arr));
        }
        
        for(int i = 0; i<m;i++)
        {
            for(int j=0; j<n ; j++)
            {
                if(!visited[i][j] && board[i][j]=='O')
                board[i][j] = 'X';
            }
        }
    }
    public void dfs(char[][] board , int i , int j , boolean[][] visited)
    {
        visited[i][j] = true;

        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};

        for(int k = 0 ; k<4;k++)
        {
            int x = i+dx[k];
            int y = j+dy[k];

            if(x<0 || y<0 || x>=board.length || y>=board[0].length)continue;

            if(!visited[x][y] && board[x][y]=='O')
            {
                dfs(board , x,y,visited);
            }
        }
    }
}