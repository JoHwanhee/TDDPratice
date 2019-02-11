package StringCalulator.test;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import StringCalulator.StringCalculator;

public class StringCalculatorTest {
	
	@Test
	public void null_�Ǵ�_����() {
		assertEquals(StringCalculator.splitAndSum(null), 0);
		assertEquals(StringCalculator.splitAndSum(""), 0);
	} 
	
	@Test
	public void ��_�ϳ�() {
		assertEquals(StringCalculator.splitAndSum("1"), 1);
	}
	
	@Test
	public void ��ǥ_������() {
		assertEquals(StringCalculator.splitAndSum("1,2"), 3);		
	}
	
	@Test
	public void ��ǥ_�ݷ�_������() {
		assertEquals(StringCalculator.splitAndSum("1,2:3"), 6);
	} 
	
	@Test
	public void ������_RuntimeException() {
	    assertThrows(RuntimeException.class, () -> StringCalculator.splitAndSum("-1,2:3"));
	} 
}
