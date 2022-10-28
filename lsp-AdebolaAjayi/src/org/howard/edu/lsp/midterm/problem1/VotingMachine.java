package org.howard.edu.lsp.midterm.problem1;

import java.util.HashMap;


public class VotingMachine {
	
	HashMap<String, Integer> candidates = new HashMap<String, Integer>();
	
	public void addCandidate(String name) {
		// Add a candidate to the list, initialize number of votes to 0
		candidates.put(name, 0);
	} 

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
	
	public int sum() {
		int sum = 0;
		for (String i : candidates.keySet()) {
				sum = sum + candidates.get(i);
		}
		return sum;
		// Return the total number of votes for all candidates.	
	}

}
