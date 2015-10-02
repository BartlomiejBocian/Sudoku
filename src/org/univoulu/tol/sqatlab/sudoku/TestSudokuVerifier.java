package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSudokuVerifier {

	String candidateSolution;
	SudokuVerifier sv;
    @Before 
    public void initialize() {
    	sv = new SudokuVerifier();
    	candidateSolution= "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
    }
    
    @Test
    public void testIfSudokuIsValid(){
		// Act
		
		//Assert
		assertEquals(0, sv.verify(candidateSolution));
    }
    
    @Test
    public void testVerifyPositveDigits(){
    	
    	assertEquals(1, sv.verifyPositveDigits(candidateSolution));
    	assertEquals(-1, sv.verifyPositveDigits("0rvwsv0000-1"));
    }
    
	@Test
	public void testFirstRule() {
		// Act
		
		//Assert
		assertEquals(-1, sv.verify(candidateSolution));
	}

	@Test
	public void testLenghtMethod() {
		// Act
		
		//Assert
		assertEquals(true, sv.validateStringLenght(candidateSolution));
	}
}
