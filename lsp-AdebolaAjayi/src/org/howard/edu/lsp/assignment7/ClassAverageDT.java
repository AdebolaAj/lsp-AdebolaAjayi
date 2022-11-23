package org.howard.edu.lsp.assignment7;

import java.util.Collections;
import java.util.List;

import org.howard.edu.lsp.midterm.problem1.UnknownCandidateException;

class ClassAverageDT implements AverageStrategy{
	@Override
	
	/** Takes in an integer list called grades, if the list is empty it throws an exception. If the length of the list is 1 or 2, it would
	 * return the average of the list, but if it the length is greater than 2, it computes the average of the grades dropping the lowest two
	 * and returns the value
	 * @param grades 
	 * @return sum/grades.size() (the average of the grades)
	 * @throws UnknownCandidateException "Can not work with empty list!")
	 */
	
	public int compute(List<Integer> grades) throws EmptyListException{
		if (grades == null || grades.size() < 1) {
			throw new EmptyListException();
		}
		if (grades.size() >= 1 && grades.size() <= 2) {
			int tsum = 0;
			for (int i = 0; i < grades.size(); i++) {
				tsum += grades.get(i);
			} 
			return tsum/grades.size();
			
		}
		
		int sum = 0;
		Collections.sort(grades);
		int length = grades.size() - 2;
		for (int i = 2; i < grades.size(); i++) {
			sum += grades.get(i);
		}
		return sum/length;
		
	}
}
