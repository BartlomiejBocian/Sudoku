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
    for ( int row = 0; row <= 8; row++ ){
      for ( int column = 0; column <= 8; column++ ){
        myPuzzle[row][column] = incomingPuzzle.charAt(row*9+column);
      }
    } 
	printPuzzle();
  }
  
  public void printPuzzle(){
    for ( char y = 0; y <=8; y++ ){
      for ( char x = 0; x <=8; x++ ){
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
