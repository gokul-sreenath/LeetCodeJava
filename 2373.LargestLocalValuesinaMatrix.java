class Solution {
  public int[][] largestLocal(int[][] grid) {
 //     int max=0;
      int res[][]=new int[grid.length-2][grid.length-2];

      for(int i=0;i<grid.length-2;i++)
      {   
          for(int j=0;j<grid.length-2;j++)
          {
              int max = 0;
              for (int k=i;k<i+3;k++) {
                  for (int l=j;l<j+3;l++) {
                      if (grid[k][l]>max) {
                          max = grid[k][l];
                      }
                  }
              }
              res[i][j] = max;
          }
      }
      return res;
  }
}