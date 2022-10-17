package org.howard.edu.lsp.assignment5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class IntegerSetTest {
	
	@Test
	@DisplayName("IntegerSet.add Test case")
	public void testAdd() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		System.out.println(set1.toString());
		assertEquals("[1, 2, 3, 4, 5]", set1.toString());
		assertNotEquals("[5, 4, 3, 2, 1]", set1.toString());
		assertNotEquals("[1, 3, 5]", set1.toString());
		
	}
	
	@Test
	@DisplayName("IntegerSet.clear Test case" )
	public void testClear() {
		IntegerSet set1 =  new IntegerSet();
		set1.add(1);
		set1.clear();
		assertTrue(set1.isEmpty());
		
		set1.add(2);
		assertFalse(set1.isEmpty());
	}
	
	@Test
	@DisplayName("IntegerSet.length Test case")
	public void testLength() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		
		assertEquals(6, set1.length());
		assertNotEquals(2, set1.length());
		assertNotEquals(7, set1.length());
		
	}
	
	@Test
	@DisplayName("IntegerSet.equals Test case")
	public void testEquals() {
		IntegerSet set1 =  new IntegerSet();
		set1.add(10);
		set1.add(20);
		
		
		IntegerSet set2 = new IntegerSet();
		set2.add(10);
		set2.add(20);
		
		assertTrue(set1.equals(set2));
		
	}
	
	@Test
	@DisplayName("IntegerSet.contains Test case")
	public void testContains() {
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		assertTrue(set1.contains(2));
		assertTrue(set1.contains(1));
		assertFalse(set1.contains(6));
		assertFalse(set1.contains(0));
		
	}
	
	@Test
	@DisplayName("IntegerSet.largest Test case")
	public void testLargest() throws IntegerSetException 
	{
	IntegerSet set1 = new IntegerSet();
	IntegerSet set2 = new IntegerSet();
	IntegerSet set3 = new IntegerSet();
	IntegerSet set4 = new IntegerSet();
	set1.add(1);
	set1.add(2);
	set1.add(3);
	set1.add(4);
	
	set2.add(10);
	set2.add(20);
	set2.add(30);
	set2.add(40);
	
	set3.add(-1);
	set3.add(-3);
	set3.add(-5);
	
	set4.add(0);
	
	assertEquals(4 , set1.largest());
	assertNotEquals(1, set1.largest());
	
	assertEquals(40 , set2.largest());
	assertNotEquals(20, set2.largest());
	
	assertEquals(-1, set3.largest());
	assertNotEquals(-5, set3.largest());
	
	assertEquals(0, set4.largest());
	assertNotEquals(-1, set4.largest());	
	
	}
	
	@Test
	@DisplayName("IntegerSet.largest Throws Exception Test case")
	public void testLargest_THROWS_EXCEPTION() {
	IntegerSet set1 = new IntegerSet();
	
	Exception exception = assertThrows(IntegerSetException.class, () -> {
	
	set1.largest();
	});
	
	String expectedMessage = "Set is empty!";
	String actualMessage = exception.getMessage();
	assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	@DisplayName("IntegerSet.smallest Test case")
	public void testSmallest() throws IntegerSetException 
	{
	IntegerSet set1 = new IntegerSet();
	IntegerSet set2 = new IntegerSet();
	IntegerSet set3 = new IntegerSet();
	IntegerSet set4 = new IntegerSet();
	set1.add(1);
	set1.add(2);
	set1.add(3);
	set1.add(4);
	
	set2.add(10);
	set2.add(20);
	set2.add(30);
	set2.add(40);
	
	set3.add(-1);
	set3.add(-3);
	set3.add(-5);
	
	assertEquals(1, set1.smallest());
	assertNotEquals(4, set1.smallest());
	
	assertEquals(10 , set2.smallest());
	assertNotEquals(40, set2.smallest());
	
	assertEquals(-5, set3.smallest());
	assertNotEquals(-1, set3.smallest());
	
	}
	

	@Test
	@DisplayName("IntegerSet.smallest Throws Exception Test case")
	public void testSmallest_THROWS_EXCEPTION() {
	IntegerSet set1 = new IntegerSet();
	
	Exception exception = assertThrows(IntegerSetException.class, () -> {
	
	set1.smallest();
	});
	
	String expectedMessage = "Set is empty!";
	String actualMessage = exception.getMessage();
	assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	@DisplayName("IntegerSet.remove Test case")
	public void testRemove() throws IntegerSetException {
	IntegerSet set1 = new IntegerSet();
	set1.add(1);
	set1.add(2);
	set1.remove(1);
	
	assertEquals("[2]", set1.toString());
	assertNotEquals("[1, 2]", set1.toString());
	
	set1.remove(2);
	assertEquals("[]", set1.toString());
	assertNotEquals("[2]", set1.toString());
	
	}
	
	@Test
	@DisplayName("IntegerSet.union Test case")
	public void testUnion() {
	IntegerSet set1 = new IntegerSet();
	set1.add(1);
	set1.add(2);
	
	IntegerSet set2 = new IntegerSet();
	set2.add(3);
	
	set1.union(set2);
	
	System.out.println(set1.toString());
	assertEquals("[1, 2, 3]", set1.toString());
	assertNotEquals("[1, 2, 4]", set1.toString());
	}
	
	@Test
	@DisplayName("IntegerSet.intersect Test case")
	public void testIntersect() {
	IntegerSet set1 = new IntegerSet();
	set1.add(2);
	set1.add(3);
	set1.add(5);
	
	IntegerSet set2 = new IntegerSet();
	set2.add(3);
	set2.add(5);
	set2.add(7);
	set2.add(9);
	
	set1.intersect(set2);
	
	System.out.println(set1.toString());
	assertEquals("[3, 5]", set1.toString());
	assertNotEquals("[2, 7]", set1.toString());
	
	}
	
	@Test
	@DisplayName("IntegerSet.diff Test case")
	public void testdiff() {
	IntegerSet set1 = new IntegerSet();
	set1.add(2);
	set1.add(3);
	
	IntegerSet set2 = new IntegerSet();
	set2.add(3);
	
	
	set1.difference(set2);
	
	
	System.out.println(set1.toString());
	assertEquals("[2]", set1.toString());
	assertNotEquals("[2,3]", set1.toString());
	
	
	}
	
	@Test
	@DisplayName("IntegerSet.isEmpty Test Case")
	public void testIsEmpty() {
	IntegerSet set1 = new IntegerSet();
	assertTrue(set1.isEmpty());
	
	set1.add(1);
	assertFalse(set1.isEmpty());
	
	}
	
	@Test
	@DisplayName("IntegerSet.toString Test Case")
	public void testToString() {
	IntegerSet set1 = new IntegerSet();
	set1.add(1);
	set1.add(2);
	set1.add(3);
	assertEquals("[1, 2, 3]", set1.toString());
	}
}
