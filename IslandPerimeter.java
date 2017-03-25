public class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeterSum = 0;
    int walls = 0;
    for (int rowNum=0; rowNum<grid.length; rowNum++) {

      for (int colNum=0; colNum<grid[rowNum].length; colNum++) {
        if (grid[rowNum][colNum] == 1) {
          walls = 4;
          if (colNum != 0 && grid[rowNum][colNum - 1] == 1) {
            walls = walls - 2;
          }
          if (rowNum != 0 && grid[rowNum - 1][colNum] == 1) {
            walls = walls - 2;
          }
        }
        perimeterSum += walls;
        walls = 0;
      }
    }
    return perimeterSum;
    }
}
