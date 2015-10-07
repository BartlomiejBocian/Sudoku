package org.univoulu.tol.sqatlab.sudoku;

public class Sudoku {
	
  private int[][] myPuzzle = new int[][]{
		
    { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
    { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
    { 0, 0, 0, 0, 0, 0, 0, 0, 0 },

    { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
    { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
    { 0, 0, 0, 0, 0, 0, 0, 0, 0 },

    { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
    { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
    { 0, 0, 0, 0, 0, 0, 0, 0, 0 }
  };

  public Sudoku(String incomingPuzzle){
    for(int row = 0; row <= 8; row++){
      for(int column = 0; column <= 8; column++){
    	  char digits = incomingPuzzle.charAt(row*9+column);
        myPuzzle[row][column] = Character.getNumericValue(digits);
      }
    } 
  }
  
  public boolean verifyPositveDigits(){
	  for(int row = 0; row <= 8; row++){
	      for(int column = 0; column <= 8; column++){
	        if ( myPuzzle[row][column] >= 1 && myPuzzle[row][column] <= 9){
	        	return true;
	        }
	      }
	    } 
	return false;
  }
  
  public void printPuzzle(){
    for(char y = 0; y <=8; y++){
      for(char x = 0; x <=8; x++){
        System.out.print(myPuzzle[y][x] + " ");
          if ( x == 2 || x == 5 ){
            System.out.print("  ");
          }
      }
      System.out.println();
      if ( y == 2 || y == 5 || y == 8 ){
        System.out.println();
      }
    }
  }
}
