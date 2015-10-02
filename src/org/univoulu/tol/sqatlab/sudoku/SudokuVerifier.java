package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {

	public int verify(String candidateSolution) {
		if(validateStringLenght(candidateSolution)){
			if(!verifyPositveDigits(candidateSolution)){
				return -1;
			}
		}
		
		return 0;
	}
	
	private boolean verifyPositveDigits(String string){
		if (string.matches("[1-9.]+")){
			return true;
		}else{
			return false;
		}
	}
	
	private boolean validateStringLenght(String string){
		if(string.length() == 81)
			return true;
		else {
			return false;
		}
	}
}
