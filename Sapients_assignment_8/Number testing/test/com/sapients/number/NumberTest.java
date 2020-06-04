package com.sapients.number;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class NumberTest {
	private Number number;
	
	@Before
	public void setup() {
		number=new Number();
	}
	@Test
	public void checkPrime_function_should_return_valid_output() {
		assertEquals(1,number.checkPrime(29));
		assertEquals(0,number.checkPrime(27));
		assertEquals(1,number.checkPrime(53));
		assertEquals(0,number.checkPrime(4));
	}
	@Test
	public void checkAmstrong_function_should_return_valid_output() {
		assertTrue(number.checkAmstrong(153));
		assertTrue(number.checkAmstrong(370));
		assertTrue(number.checkAmstrong(371));
		assertFalse(number.checkAmstrong(44));
		assertFalse(number.checkAmstrong(37));
		assertFalse(number.checkAmstrong(23));
	}
	@Test
	public void checkPalindrome_function_should_return_valid_output() {
		assertTrue(number.checkPalindrome(153351));
		assertTrue(number.checkPalindrome(151));
		assertTrue(number.checkPalindrome(12321));
		assertFalse(number.checkPalindrome(245));
		assertFalse(number.checkPalindrome(4567));
		assertFalse(number.checkPalindrome(876));

	}
	@After
	public void teardown() {
		number=null;
	}
	

}
