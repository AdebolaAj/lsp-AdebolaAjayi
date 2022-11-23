package org.howard.edu.lsp.midterm.problem1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class VotingMachineTest {
	@Test
	@DisplayName("VotingMachine.getVotes Test case")
	public void testGetVotes() {
		VotingMachine candidates = new VotingMachine();
		candidates.addCandidate("Adebola");
		candidates.addCandidate("Jack");
		candidates.addCandidate("Jeremiah");
		try {
			assertEquals(0, candidates.getVotes("Adebola"));
		} catch (UnknownCandidateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		candidates.castVotes("Adebola", 1000);
		candidates.castVotes("Jeremiah", 800);
		
		try {
			assertEquals(1000, candidates.getVotes("Adebola"));
		} catch (UnknownCandidateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Test
	@DisplayName("VotingMachine.getVotes Throws Exception Test case")
	public void testgetVotes_THROWS_EXCEPTION() {
		VotingMachine candidates = new VotingMachine();
	
		Exception exception = assertThrows(UnknownCandidateException.class, () -> {
	
			candidates.getVotes("Adebola");
	});
	
	String expectedMessage = "Invalid Name!";
	String actualMessage = exception.getMessage();
	assertTrue(actualMessage.contains(expectedMessage));
	}
	
	@Test
	@DisplayName("VotingMachine.sum Test case")
	public void testSum() {
		VotingMachine candidates = new VotingMachine();
		candidates.addCandidate("Adebola");
		candidates.addCandidate("Jack");
		candidates.addCandidate("Jeremiah");
		candidates.castVotes("Adebola", 1000);
		candidates.castVotes("Adebola", 900);
		candidates.castVotes("Jeremiah", 800);
		
		assertEquals(2700, candidates.sum());
	}
	
}
