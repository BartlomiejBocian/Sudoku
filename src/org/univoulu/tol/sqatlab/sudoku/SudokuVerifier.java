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
		}else
			return 1;

		return 0;
	}

//	private boolean checkDigitInGlobalRow(String string){
//		for (String strTmp : string.split("(?<=\\G.{9})")) {
//			Map<Character,Integer> map = new HashMap<Character,Integer>();
//			for (int i = 0; i < strTmp.length(); i++) {
//				char c = strTmp.charAt(i);
//				if (map.containsKey(c)) {
//					return false;
//				} else {
//					map.put(c, 1);
//				}
//			}
//		}
//		return true;
//	}
}
