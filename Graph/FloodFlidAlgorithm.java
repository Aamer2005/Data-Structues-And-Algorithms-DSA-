//leetcode problem : 733: https://leetcode.com/problems/flood-fill/description/

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int src_color = image[sr][sc];

        if(src_color!=color)
        {
            dfs_visit(image , sr , sc , color , src_color);
        }

        return image;
    }

    public void dfs_visit(int[][] image ,int sr ,int sc ,int color ,int src_color){

        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || image[sr][sc]!=src_color)
        return ;

        image[sr][sc]  = color;

        int i = sr , j = sc;

        dfs_visit(image,i-1,j,color,src_color);            
        dfs_visit(image,i+1,j,color,src_color);            
        dfs_visit(image,i,j-1,color,src_color);            
        dfs_visit(image,i,j+1,color,src_color);   
    }         

}

