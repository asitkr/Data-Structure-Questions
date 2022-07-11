import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

class Pair{
    int x;
    int y;
    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class RottenOranges {
    public static void main (String[] args) {
                      // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] grid = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                grid[i][j] = sc.nextInt();
            }
        }

        System.out.println(orangesRotting(grid));
    }

    public static int orangesRotting(int[][] grid){
        int row = grid.length;
        int col = grid[0].length;
        
        Queue<Pair> q = new LinkedList<>();
        
        int total = 0, rotten = 0, time = 0;
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j] == 1 || grid[i][j] == 2){
                    total++;
                }
                
                if(grid[i][j] == 2){
                    q.add(new Pair(i, j));
                }
            }
        }
        
        if(total == 0) return 0;
        
        while(!q.isEmpty()){
            int size = q.size();
            
            rotten += size;
            
            if(total == rotten) return time;
            
            time++;
            
            for(int i=0; i<size; i++){
                Pair p = q.peek();
                
                if(p.x + 1 < row && grid[p.x + 1][p.y] == 1){
                    grid[p.x + 1][p.y] = 2;
                    q.add(new Pair(p.x + 1, p.y));
                }
                
                if(p.x - 1 >= 0 && grid[p.x - 1][p.y] == 1){
                    grid[p.x - 1][p.y] = 2;
                    q.add(new Pair(p.x - 1, p.y));
                }
                
                if(p.y + 1 < col && grid[p.x][p.y + 1] == 1){
                    grid[p.x][p.y + 1] = 2;
                    q.add(new Pair(p.x, p.y + 1));
                }
                
                if(p.y - 1 >= 0 && grid[p.x][p.y - 1] == 1){
                    grid[p.x][p.y - 1] = 2;
                    q.add(new Pair(p.x, p.y - 1));
                }
                q.poll();
            }
        }
        
        return -1;
    }
}