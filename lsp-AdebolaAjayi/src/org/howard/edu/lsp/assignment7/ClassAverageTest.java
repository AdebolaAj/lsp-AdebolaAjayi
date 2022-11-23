package org.howard.edu.lsp.assignment7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ClassAverageTest {
	@Test
	public void testClassAverage() {
		AverageContext context = new AverageContext();
		context.setAverageStrategy(new ClassAverage());
		try {
			assertEquals(6,context.compute(Arrays.asList(5,7,12,3)));
		} 
		catch (EmptyListException empty) {
			fail();
		}
		
	}
	
	@Test
	public void testClassAverageException() {
		AverageContext context = new AverageContext();
		context.setAverageStrategy(new ClassAverage());
		try {
			assertEquals(6,context.compute(Arrays.asList()));
			fail();
		} catch (EmptyListException empty) {
		}
		
	}
	
	@Test
	public void testClassAverageDT() {
		AverageContext context = new AverageContext();
		context.setAverageStrategy(new ClassAverageDT());
		try {
			assertEquals(9, context.compute(Arrays.asList(5,7,12,3)));
		}
		catch (EmptyListException empty) {
			fail();
		}
		
	}

	@Test
	public void testClassAverageDT2() {
		AverageContext context = new AverageContext();
		context.setAverageStrategy(new ClassAverageDT());
		try {
			assertEquals(6, context.compute(Arrays.asList(5,7)));
		}
		catch (EmptyListException empty) {
			fail();
		}
		
	}
	
	@Test
	public void testClassAverageDTException() {
		AverageContext context = new AverageContext();
		context.setAverageStrategy(new ClassAverageDT());
		try {
			assertEquals(6, context.compute(Arrays.asList()));
			fail();
		}
		catch (EmptyListException empty) {
		}
		
	}
}
