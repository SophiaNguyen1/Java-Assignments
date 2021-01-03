// The "MazeFinder" class.
import java.awt.*;

public class MazeFinder
{

    public MazeFinder ()
    {
    }

    
    public void start ()
    {
      int[][] mazeArr = {{0,0,1,1,1},
                         {1,0,1,1,1},
                         {1,0,1,1,1},
                         {1,0,0,0,0},
                         {1,1,1,1,1}};
      findEntrance (mazeArr);
    }
    
    public int[][] resetMaze ()
    {
        int [][] originalMazeArr = {{0,0,1,1,1},
                                   {1,0,1,1,1},
                                   {1,0,1,1,1},
                                   {1,0,0,0,0},
                                   {1,1,1,1,1}};
        return originalMazeArr;
    }
    
    public int getMazeValue(int[][]maze, int x, int y)
    {
        return maze[x][y];
    }
    
    public void markSpot (int[][]maze, int x, int y)
    {
        maze[x][y]=2;
    }
    
    public void findEntrance (int[][]maze)
    {
      for (int i = 0; i<5; i++)
      {
            if (maze[0][i] == 0)//if entrance is found at row at index 0
            {
                System.out.println(solveMaze (maze, 0, i));
                maze = resetMaze();
            }
      }
      for (int i = 1; i < 5; i++)
      {
            if (maze[i][0] == 0)//searches column at index 0
            {
                System.out.println(solveMaze (maze,i,0));
                maze = resetMaze();
            }
        }
    }

    private boolean isValid (int[][]maze, int xCoord, int yCoord) 
    {
        if (xCoord >= 0 && xCoord < 5 && yCoord >= 0 && yCoord < 5)//check if cell is in bounds
        {
            if (maze[xCoord][yCoord]==0)//check if cell is not a wall
            { 
                return true; 
            }
        }
        return false;
    }
    
     public boolean solveMaze (int[][]maze, int x, int y)
     { 
        boolean exitPossible = false;//used to return true if exit exists or false if it doesn't once entire array is traversed
        if (isValid (maze, x, y) == true)//calls boolean black box return method valid to see if cell within bounds
        {
            markSpot(maze, x,y);//tested cell has been changed to prevent infinite recursion
            if (x == 4 || y == 4)
            {
                exitPossible = true;//maze search is complete
            }
            else 
            {
                exitPossible = solveMaze (maze, x+1, y);//check right
                if (exitPossible == false)
                    exitPossible = solveMaze (maze, x, y-1);//check down 
                if (exitPossible == false)
                    exitPossible = solveMaze (maze, x, y+1);//check up
                if (exitPossible == false)
                    exitPossible = solveMaze (maze, x-1, y);//check left 
            }
        }
        return exitPossible;

    } 


    public static void main (String[] args)
    {
        MazeFinder a = new MazeFinder ();
        a.start ();
        // Place your program here.  'c' is the output console
    } // main method
} // MazeFinder class
