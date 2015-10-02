package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSudokuVerifier {

	String inValidStringTest;
	String inValidStringTest1;
	String inValidStringTest2;
	String inValidStringTest3;

	String validString;
	SudokuVerifier sv;
	
    @Before 
    public void initialize() {
    	sv = new SudokuVerifier();
    	validString = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
    	inValidStringTest = "3456789912345678891234567789123456678912345567891234456789123345678912234567891";
    	inValidStringTest1 = "003456789912345678891234567789123456678912345567891234456789123345678912234567891";
    	inValidStringTest2 = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
    	inValidStringTest3 = "113456789912345678891234567789123456678912345567891234456789123345678912234567891";

    }
    
    @Test
    public void testIfSudokuIsValid(){
		assertEquals(0, sv.verify(validString));
    }
    
    @Test
    public void testLenghtCorrect(){
    	//invalid
    	assertEquals(1, sv.verify(inValidStringTest));
    	//valid
    	assertEquals(0, sv.verify(validString));
    }
    
	@Test
	public void testFirstRule() {
		//invalid
		assertEquals(-1, sv.verify(inValidStringTest1));
		//valid
		assertEquals(0, sv.verify(validString));
	}
	
	@Test
	public void testSecondRule() {
		assertEquals(-2, sv.verify(inValidStringTest2));
	}
	
	@Test
	public void testThirdRule() {
		//invalid
		assertEquals(-3, sv.verify(inValidStringTest3));
		//valid
		assertEquals(0, sv.verify(validString));
	}
	
	@Test
	public void testGlobalRowMethod(){
		assertEquals(true, sv.checkDigitInGlobalRow(validString));
		assertEquals(false, sv.checkDigitInGlobalRow(inValidStringTest3));
	}
	
}
