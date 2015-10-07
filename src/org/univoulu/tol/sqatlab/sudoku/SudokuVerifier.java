package org.univoulu.tol.sqatlab.sudoku;

import java.util.HashMap;
import java.util.Map;

public class SudokuVerifier {

	private Sudoku sudoku;

	public int verify(String candidateSolution) {
		sudoku = new Sudoku(candidateSolution);
		if(sudoku.validateStringLenght()){
			sudoku.createPuzzle();
			if(!sudoku.verifyPositveDigits()){
				return -1;
			}
			if(!sudoku.checkDigitInGlobalRow()){
				return -3;
			}
			if(!sudoku.checkDigitInGlobalColumn()){
				return -4;
			}
		}else
			return 1;

		return 0;
	}
}
