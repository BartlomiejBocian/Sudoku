package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		// returns 1 if the candidate solution is correct
		return 0;
	}
	
	private int verifyPositveDigits(String string){
		if (string.matches("[1-9.]+")){
			return 1;
		}else{
			return -1;
		}
	}
	
}
