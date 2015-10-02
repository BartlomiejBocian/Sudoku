package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSudokuVerifier {

	String candidateSolution;
	
    @Before 
    public void initialize() {
    	candidateSolution= "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
    }
	
    @Test
    public void testIfSudokuIsValid(){
    	SudokuVerifier sv = new SudokuVerifier();
		// Act
		
		//Assert
		assertEquals(0, sv.verify(candidateSolution));
    }
    
    @Test
    public void testVerifyPositveDigits(){
    	SudokuVerifier sv = new SudokuVerifier();
    	
    	assertEquals(1, sv.verifyPositveDigits(candidateSolution));
    	assertEquals(-1, sv.verifyPositveDigits("0rvwsv0000-1"));
    }
    
	@Test
	public void testFirstRule() {
		//Arrange
		SudokuVerifier sv = new SudokuVerifier();
		// Act
		
		//Assert
		assertEquals(-1, sv.verify(candidateSolution));
	}

	
}
