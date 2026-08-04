package tejasleetcodeproblemssolved.Problems.Mediums;

public class MaxAreaOfIsland {
    private static final int[][] directions = {{0, -1}, {0, 1}, {-1, 0}, {1,0}};

    public static int maxIslandArea(int[][] grid){
        int max_a = 0;

        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[0].length; c++){
                max_a = Math.max(max_a, dfsArea(grid, r, c));
            }
        }

        return max_a;
    }

    private static int dfsArea(int[][] grid, int r, int c){
        if(r >= grid.length || c >= grid[0].length) return 0;
        if(r < 0 || c < 0) return 0;
        if(grid[r][c] == 0) return 0;

        int res = 1;
        grid[r][c] = 0;
        for(int[] dir : directions){
            res += dfsArea(grid, r + dir[0], c + dir[1]);
        }
        return res;

    }
    
    public static void main(String[] args) {
        int[][] test1 = { // Print 7
                        {0,1,1,1,0},
                        {0,1,0,1,0},
                        {1,1,0,0,0},
                        {0,0,0,0,0}
                        };

        int[][] test2 = { // Print 4
                        {1,1,0,0,1},
                        {1,1,0,0,1},
                        {0,0,1,0,0},
                        {0,0,0,1,1}
                        };

        System.out.println(maxIslandArea(test1));
        System.out.println(maxIslandArea(test2));
    }
}
