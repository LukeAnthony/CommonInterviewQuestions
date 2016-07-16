package questions.zerotoone.general;

/*
 * In the game of life, there is a set of cells. A cell can be either alive or dead. Its state can change
 *  from one generation to another. 
 *  
 * Conditions: 
 *  1) A live cell with fewer than 2 live neighbors dies
 *  2) A dead cell with 2 live neighbors resurrects 
 *  3) A live cell with greater than 2 live neighbors dies
 *  
 *  The set of cells will be an N * N matrix.
 *  
 *  Problem: Given a current generation of cells in a matrix, write an algorithm that determines
 *      what the next generation looks like
 *      
 *  Pre-code thoughts: Array of booleans. Work out an algorithm on paper first. Then test it against a hard
 *      coded matrix. Once proven, test against a randomly generated matrix.
 */
public class GameOfLife {

  public static boolean[][] determineNextGeneration(boolean currentGeneration[][]){
    int dimension = currentGeneration.length - 1;
    boolean nextGeneration[][] = new boolean[dimension + 1][dimension + 1];
    
    for(int x = 0; x <= dimension; x++){
      for(int y = 0; y <= dimension; y++){
        boolean currentState = currentGeneration[x][y];
        int likeCount = 0;
        if(x == 0 && y == 0){
          if(currentGeneration[x+1][y+1] == true) likeCount++;
          if(currentGeneration[x][y+1]==true) likeCount++;
          if(currentGeneration[x+1][y]==true) likeCount++;
        }
        else if(x == 0){
          if(y != dimension){
            if(currentGeneration[x][y-1] == true) likeCount++;
            if(currentGeneration[x][y+1]==true) likeCount++;
            if(currentGeneration[x+1][y-1]==true) likeCount++;
            if(currentGeneration[x+1][y+1] == true) likeCount++;
            if(currentGeneration[x+1][y]==true) likeCount++;
          }
          else{
            if(currentGeneration[x][y-1] == true) likeCount++;
            if(currentGeneration[x+1][y]==true) likeCount++;
            if(currentGeneration[x+1][y-1]==true) likeCount++;
          }
        }
        else if (y == 0){
          if(x != dimension){
            if(currentGeneration[x-1][y] == true) likeCount++;
            if(currentGeneration[x+1][y]==true) likeCount++;
            if(currentGeneration[x-1][y+1]==true) likeCount++;
            if(currentGeneration[x][y+1] == true) likeCount++;
            if(currentGeneration[x+1][y+1]==true) likeCount++;
          }
          else{
            if(currentGeneration[x-1][y] == true) likeCount++;
            if(currentGeneration[x-1][y+1]==true) likeCount++;
            if(currentGeneration[x][y+1]==true) likeCount++;
          }
        }
        else if(x == dimension && y == dimension){
          if(currentGeneration[x-1][y] == true) likeCount++;
          if(currentGeneration[x][y-1]==true) likeCount++;
          if(currentGeneration[x-1][y-1]==true) likeCount++;
        }
        else if(x == dimension){
          if(currentGeneration[x][y-1] == true) likeCount++;
          if(currentGeneration[x][y+1]==true) likeCount++;
          if(currentGeneration[x-1][y]==true) likeCount++;
          if(currentGeneration[x-1][y-1] == true) likeCount++;
          if(currentGeneration[x-1][y+1]==true) likeCount++;
        }
        else if (y == dimension){
          if(currentGeneration[x-1][y] == true) likeCount++;
          if(currentGeneration[x+1][y]==true) likeCount++;
          if(currentGeneration[x][y-1]==true) likeCount++;
          if(currentGeneration[x-1][y-1] == true) likeCount++;
          if(currentGeneration[x+1][y-1]==true) likeCount++;
          
        }
        else{
          if(currentGeneration[x+1][y+1] == true) likeCount++;
          if(currentGeneration[x-1][y-1]==true) likeCount++;
          if(currentGeneration[x+1][y-1]==true) likeCount++;
          if(currentGeneration[x-1][y+1] == true) likeCount++;
          if(currentGeneration[x][y+1]==true) likeCount++;
          if(currentGeneration[x][y-1]==true) likeCount++;
          if(currentGeneration[x+1][y] == true) likeCount++;
          if(currentGeneration[x-1][y]==true) likeCount++;
        }
        
        if(currentGeneration[x][y] == true){
          if(likeCount == 2){
            nextGeneration[x][y] = true;
          }
          else nextGeneration[x][y] = false;
        }
        else{
          if(likeCount >= 2) nextGeneration[x][y] = true;
          else nextGeneration[x][y] = false;
        }
      }
    }
      
    
    return nextGeneration;
  }  
  
}
