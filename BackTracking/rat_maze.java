package BackTracking;

import java.util.*;
public class rat_maze {
    
    public static void solution(int i, int j, int[][] maze, int n, ArrayList<String> result, StringBuilder currentPath){
        String dir = "DLRU";
        int[] di = {1, 0, 0, -1};
        int[] dj = {0, -1, 1, 0};

        if(i == n-1 && j == n-1){
            result.add(currentPath.toString());
            return;

        }
        
        maze[i][j] = 0; //Blocked

        for(int ind=0; ind < 4; ind++){
            int nexti = i + di[ind];
            int nextj = j + dj[ind];

            if( nexti>=0 && nextj>=0 && nexti<n && nextj<n && maze[nexti][nextj] == 1){
                currentPath.append(dir.charAt(ind));
                solution(nexti, nextj, maze, n, result, currentPath);
                currentPath.deleteCharAt(currentPath.length() - 1); // Remove the last letter
            }
        }
        maze[i][j] = 1;
    }

    public static void main(String[] args)
    {
        int[][] maze = { { 1, 0, 0, 0 },
                         { 1, 1, 0, 1 },
                         { 1, 1, 0, 0 },
                         { 0, 1, 1, 1 } };

        int n = maze.length;

        ArrayList<String> result = new ArrayList<>();
        StringBuilder currentPath = new StringBuilder();

        solution(0, 0, maze, n, result, currentPath);

        if (result.size() == 0)
            System.out.println("No Path Found");
        else
            for (String path : result)
                System.out.print(path + " ");
        System.out.println();
    }
}
