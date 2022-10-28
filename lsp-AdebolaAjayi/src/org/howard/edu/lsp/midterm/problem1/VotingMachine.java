package org.howard.edu.lsp.midterm.problem1;

import java.util.HashMap;


public class VotingMachine {
	/**
	 * Creates a hashmap to store the candidate names and votes
	 */
	
	HashMap<String, Integer> candidates = new HashMap<String, Integer>();
	
	/**
	 * adds candidate to the hashmap and sets the vote value to 0
	 * @param name
	 */
	
	public void addCandidate(String name) {
		// Add a candidate to the list, initialize number of votes to 0
		candidates.put(name, 0);
	} 
	
	/**
	 * finds a candidate in the hashmap and increment its vote value by the integer given then replaces the value in the hashmap.
	 * @param name
	 * @param votes
	 */

	public void castVotes(String name, int votes) {
		for (String i : candidates.keySet()) {
			if (name.equals(i)) {
				int num = candidates.get(name);
				num = num + votes;
				candidates.replace(name, num);
			}
		}
		// Cast votes to the candidate with the given name
	}
	
	/**
	 * checks if a candidate is in the hashmap and if it is return the votes for that candidate if it is not howver, throw an exception
	 * and says "Invalid Name!"
	 * @param names
	 * @return Votes
	 * @throws UnknownCandidateException "Invalid Name!")
	 */

	public int getVotes(String names)  throws UnknownCandidateException {
		if (!(candidates.containsKey(names))) {
			throw new UnknownCandidateException("Invalid Name!");
		}
		int votes = 0;
		if (candidates.containsKey(names)) {
			votes = candidates.get(names);
		}
		return votes;
		// Return the number of votes for a given candidate.  Throws
// UnknownCandidateException if name not present.  Make this a 
// checked exception.
	}
	
	/**
	 * Goes through the hashmap and adds the votes for each candidates then returns the sum of the addition
	 * @return sum
	 */
	
	public int sum() {
		int sum = 0;
		for (String i : candidates.keySet()) {
				sum = sum + candidates.get(i);
		}
		return sum;
		// Return the total number of votes for all candidates.	
	}

}
