package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSudokuVerifier {

	String inValidStringTest;
	String inValidStringTest1;
	String inValidStringTest2;
	String inValidStringTest3;
	String inValidStringTest4;

	String validString;
	SudokuVerifier sv;

	@Before 
	public void initialize() {
		sv = new SudokuVerifier();
		validString = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		inValidStringTest = "417";
		inValidStringTest1 = "003456789912345678891234567789123456678912345567891234456789123345678912234567891";
		inValidStringTest2 = "417369825643215894795872431682543716979158643234691275828964357157329168416487529";
		inValidStringTest3 = "417369825632158947958724316825437169791586432346912758289643573573291684164875291";
		inValidStringTest4 = "417369825632158947958724316825437169791586432346912758289643571573291684164875239";
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
		//invalid
		assertEquals(-2, sv.verify(inValidStringTest2));
		//valid
		assertEquals(0, sv.verify(validString));
	}

	@Test
	public void testThirdRule() {
		//invalid
		assertEquals(-3, sv.verify(inValidStringTest3));
		//valid
		assertEquals(0, sv.verify(validString));
	}

	@Test
	public void testFourthRule() {
		//invalid
		assertEquals(-4, sv.verify(inValidStringTest4));
		//valid
		assertEquals(0, sv.verify(validString));
	}

}
