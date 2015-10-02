package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSudokuVerifier {

	String candidateSolution;
	
    @Before 
    public void initialize() {
    	candidateSolution= "";
    }
	
    @Test
    public void checkIfSudokuIsValid(){
    	SudokuVerifier sv = new SudokuVerifier();
		// Act
		
		//Assert
		assertEquals(0, sv.verify(candidateSolution));
    }
    
	@Test
	public void checkFirstRule() {
		//Arrange
		SudokuVerifier sv = new SudokuVerifier();
		// Act
		
		//Assert
		assertEquals(-1, sv.verify(candidateSolution));
	}

	
}
