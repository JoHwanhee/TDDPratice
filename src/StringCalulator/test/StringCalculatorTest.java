package StringCalulator.test;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import StringCalulator.StringCalculator;

public class StringCalculatorTest {
	
	@Test
	public void null_또는_공란() {
		assertEquals(StringCalculator.splitAndSum(null), 0);
		assertEquals(StringCalculator.splitAndSum(""), 0);
	} 
	
	@Test
	public void 값_하나() {
		assertEquals(StringCalculator.splitAndSum("1"), 1);
	}
	
	@Test
	public void 쉼표_구분자() {
		assertEquals(StringCalculator.splitAndSum("1,2"), 3);		
	}
	
	@Test
	public void 쉼표_콜론_구분자() {
		assertEquals(StringCalculator.splitAndSum("1,2:3"), 6);
	} 
	
	@Test
	public void 음수는_RuntimeException() {
	    assertThrows(RuntimeException.class, () -> StringCalculator.splitAndSum("-1,2:3"));
	} 
}
