package org.howard.edu.lsp.assignment7;

import java.util.List;


class ClassAverage implements AverageStrategy{
	@Override
	/** Takes in an integer list called grades, if the list is empty it throws an exception but if it isnt, computes the average of the
	 * grades and returns the value
	 * @param grades 
	 * @return sum/grades.size() (the average of the grades)
	 * @throws UnknownCandidateException "Can not work with empty list!")
	 */
	public int compute(List<Integer> grades) throws EmptyListException{
		if (grades == null || grades.size() < 1) {
			throw new EmptyListException();
		}
		int sum = 0;
		for (int i = 0; i < grades.size(); i++) {
			sum += grades.get(i);
		}
		return sum/grades.size();
		
	}
}
