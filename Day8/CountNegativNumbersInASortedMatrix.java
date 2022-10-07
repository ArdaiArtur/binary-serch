package Day8;

public class CountNegativNumbersInASortedMatrix {
    public int countNegatives(int[][] grid) {
        int counts=0;
        for (int i = 0;i<grid.length; i++) {
           
            for (int j = grid[0].length-1; j >=0; j--) {
                if(grid[i][j]>=0) break;
                else
                {
                    counts++;
                }
            }
        }
        return counts;
    }
}
