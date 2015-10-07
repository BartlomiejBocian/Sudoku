package org.univoulu.tol.sqatlab.sudoku;

import java.util.HashMap;
import java.util.Map;

public class Sudoku {

	private String puzzleString;

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
		puzzleString = incomingPuzzle;
	}

	public void createPuzzle(){
		for(int row = 0; row <= 8; row++){
			for(int column = 0; column <= 8; column++){
				char digits = puzzleString.charAt(row*9+column);
				myPuzzle[row][column] = Character.getNumericValue(digits);
			}
		} 
	}

	public boolean validateStringLenght(){
		if(puzzleString.length() == 81)
			return true;
		else {
			return false;
		}
	}

	public boolean verifyPositveDigits(){
		boolean positveDigits = false;
		for(int row = 0; row <= 8; row++){
			for(int column = 0; column <= 8; column++){
				if ( myPuzzle[row][column] >= 1 && myPuzzle[row][column] <= 9){
					positveDigits = true;
				}else{
					return false;
				}
			}
		} 
		return positveDigits;
	}

	public boolean checkDigitInGlobalRow(){
		for(int row = 0; row <= 8; row++){
			Map<Integer,Integer> map = new HashMap<Integer,Integer>();
			for(int column = 0; column <= 8; column++){
				if (map.containsKey(myPuzzle[row][column])) {
					return false;
				} else {
					map.put(myPuzzle[row][column], 1);
				}
			}
		} 
		return true;
	}

	public boolean checkDigitInGlobalColumn(){
		for(int column = 0; column <= 8; column++){
			Map<Integer,Integer> map = new HashMap<Integer,Integer>();
			for(int row = 0; row <= 8; row++){
				if (map.containsKey(myPuzzle[row][column])) {
					return false;
				} else {
					map.put(myPuzzle[row][column], 1);
				}
			}
		} 
		return true;
	}
	
	private void printPuzzle(){
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
