package org.univoulu.tol.sqatlab.sudoku;

public class Sudoku {
	
  private char[][] myPuzzle = new char[][]{
		
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
	  for ( int row = 0; row <= 8; row++ )
      {
          for ( int column = 0; column <= 8; column++ )
          {
              myPuzzle[row][column] = incomingPuzzle.charAt(row*9+column);
          }
      }  
  }
}
