package MockExamination.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import MockExamination.src.MockExamination;

public class MockExaminationTest {
	
	@Test
	public void case01() {
		assertArrayEquals(MockExamination.solution(new int[] {1,2,3,4,5}), new int[] {1});
	}
	
	@Test
	public void case02() {
		assertArrayEquals(MockExamination.solution(new int[] {1,2,3,4,2}), new int[] {1, 2,3});
	}
}
