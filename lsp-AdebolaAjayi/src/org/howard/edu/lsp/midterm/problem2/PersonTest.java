package org.howard.edu.lsp.midterm.problem2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.howard.edu.lsp.midterm.problem1.VotingMachine;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class PersonTest {
	@Test
	@DisplayName("PersonTest.toString Test case")
	public void testToString() {
		Person person = new Person("Adebola", "111-11-1111", 20);
		
		assertEquals("Adebola, 20, 111-11-1111", person.toString());
	}
	
	@Test 
	@DisplayName("PersonTest.equal Test case")
	public void testEqual() {
		Person person = new Person("Adebola", "111-11-1111", 20);
		String person2 = "Adebola, 20, 111-11-1111";
		Person person3 = new Person("Aj", "111-11-1111", 30);
		
		assertEquals(false, person.equals(person2));
		assertEquals(true, person.equals(person3));
	}
	
	

}
