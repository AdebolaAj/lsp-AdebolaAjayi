package org.howard.edu.lsp.assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Combo_Finder {
	
	public static ArrayList<ArrayList<Integer>> combo_finder(ArrayList<Integer> array, int target) {
		/* - Calculates all combinations that add up to the target sum
		   - Returns the combinations as an ArrayList<ArrayList<Integer>>
		   - Each combination contains the indices of the elements that add up to the target sum */

        ArrayList<Integer> found = new ArrayList<Integer>();	// A List to keep track of the integers seen thus far
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();	// A list of lists to store the combinations
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) >= 0) {	// Check for deprecated element: we will deprecated an element by setting its value to -1
                ArrayList<Integer> combo = new ArrayList<Integer>();	// A list to store the indices of the elements of the combination
                if (array.get(i) == target) {			// If the current element == target sum
                	combo.add(i);						// Add the current element's index to a list
                    if (!result.contains(combo)) { 	// Add the list to the result as a new combination
                        result.add(combo); 		 	// if it is not already present in result
                    }
                } else {
                    int newTarget = target - array.get(i); 	// Check is there is an element (target) in the array that when added
                    if ((found.contains(newTarget)) && (i != found.indexOf(newTarget))){	// to the current element equals the target sum
                        int index = found.indexOf(newTarget);	// If there is create a list of the indices of the pair
                        combo.add(i);
                        combo.add(index);
                        Collections.sort(combo);				// Sort the list to help with comparison
                        if (!result.contains(combo)) {		// If the list is not already a part of the result list
                            result.add(combo);				// add it to result as a new combination
                        }
                    } else {
                    	found.add(array.get(i));		// Add the current element to the list of found elements
                        if (newTarget > 0) {	// Base case for recursion call
                            ArrayList<Integer> newArray = new ArrayList<Integer>(array.size());
                            for (int x : array) {	// Create a copy of the array
                                newArray.add(x);
                            }
                            newArray.set(i, -1);	// Deprecate the current element in the new array
                            for (ArrayList<Integer> combination : combo_finder(newArray, newTarget)) {
                                if (!combination.contains(i)){	
                                	combination.add(i);				// For each combination returned by the recursive call
                                    Collections.sort(combination);	// Add the current element's index to the combination if it is not already a part of the combination
                                    if (!result.contains(combination)) {	// If the result list does not already contain the combination
                                        result.add(combination);	// Add the combination to the result list
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return result;		// Return the complete list of all the combinations
    }

    public static void printCombo(ArrayList<Integer> array, ArrayList<ArrayList<Integer>> combinations) {
        /* Prints formatted output of the combinations */

        Collections.sort(combinations, new Comparator<ArrayList>(){
            public int compare(ArrayList a1, ArrayList a2) {
                return a1.size() - a2.size();
            }
        });

        int max_index = array.size() - 1;
        if (max_index == 0) {
            int max_index_value = 1;
        }
        int counter = 0;
        while (max_index > 0) {
            counter += 1;
            max_index /= 10;
        }
        
        int max_index_value = counter;
        
        
        System.out.println("\nCombinations:");
        for (ArrayList<Integer> combination : combinations) {
            int width = ((max_index_value + 2) * combinations.get(combinations.size() - 1).size()) + 2;
            String format = "%-" + width + "s";

            String format2 = "%" + max_index_value + "d";
            String output = "";
            output += "[";
            for (int i = 0; i < combination.size(); i++) {
                if (i == combination.size() - 1) {
                    output += String.format(format2, combination.get(i)) + "]";
                } else {
                    output += String.format(format2, combination.get(i)) + ", ";
                }
            }
            System.out.printf(format, output);
            
        }
    }


}
