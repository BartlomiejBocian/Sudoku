package org.univoulu.tol.sqatlab.sudoku;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Sudoku {

	private String puzzleString;
	private char c;

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
			Map<Character,Integer> map = new HashMap<Character,Integer>();
			for(int column = 0; column <= 8; column++){
				if (map.containsValue(myPuzzle[row][column])) {
					return false;
				} else {
					map.put(c,myPuzzle[row][column]);
				}
			}
		} 
		return true;
	}

	public boolean checkDigitInGlobalColumn(){
		for(int column = 0; column <= 8; column++){
			Map<Character,Integer> map = new HashMap<Character,Integer>();
			for(int row = 0; row <= 8; row++){
				if (map.containsValue(myPuzzle[row][column])) {
					return false;
				} else {
					map.put(c,myPuzzle[row][column]);
				}
			}
		} 
		return true;
	}

	public boolean checkSubGrid(){
		for(int column = 0; column <= 8; column++){
			for(int row = 0; row <= 8; row++){
				if (checkNumberInGrid(myPuzzle[row][column], row, column)) {
					return true;
				}
			} 
		}
		return false;
	}

	private boolean checkNumberInGrid(int num, int row, int col){
		int r = (row / 3) * 3;
		int c = (col /3) * 3;
		for (int i = 0; i < 9; i++){
			if(getCell(r + (i % 3), c+(i / 3)) == num){
				return false;
			}
		}
		return true;
	}

	private int getCell(int row, int column){
		return myPuzzle[row][column];
	}

	private void printPuzzle(){
		for(int y = 0; y <=8; y++){
			for(int x = 0; x <=8; x++){
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
