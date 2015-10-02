package org.univoulu.tol.sqatlab.sudoku;

import java.util.HashMap;
import java.util.Map;

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
	
	public boolean checkDigitInGlobalRow(String string){
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for (String strTmp : string.split("(?<=\\G.{9})")) {
			for (int i = 0; i < strTmp.length(); i++) {
				char c = strTmp.charAt(i);
				  if (map.containsKey(c)) {
				    return false;
				  } else {
				    map.put(c, 1);
				  }
			}
		}
		return true;
	}
}
