package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSudokuVerifier {

	String validString;
	SudokuVerifier sv;
	
    @Before 
    public void initialize() {
    	sv = new SudokuVerifier();
    	validString= "023456789912345678891234567789123456678912345567891234456789123345678912234567891";
    }
    
    @Test
    public void testIfSudokuIsValid(){
		// Act
		
		//Assert
		assertEquals(0, sv.verify(validString));
    }
    
	@Test
	public void testFirstRule() {
		// Act
		
		//Assert
		assertEquals(-1, sv.verify(validString));
	}
}
