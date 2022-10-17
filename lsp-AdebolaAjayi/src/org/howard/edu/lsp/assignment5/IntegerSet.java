package org.howard.edu.lsp.assignment5;

import java.util.ArrayList;
import java.util.List;

public class IntegerSet {
private ArrayList<Integer> set = new ArrayList<Integer>();
    /**
     * The constructor of the integer set.
     */
    // Default Constructor
    public IntegerSet() {}
    
    /**
     * 
     * @return the set created
     */
    
    public ArrayList<Integer> getSet() {
        return this.set;
    }
    /**
     * clears the set
     */
    // Clears the internal representation of the set
    public void clear() {
        this.set.clear();
    }
    
    /**
     * Finds the size of set
     * @return The length of the set.
     */
    
    // Return the length of set
    public int length() {
        return this.set.size();
    }
    
    // 
    /**
     * This method returns true if 2 sets are equal, false otherwise
     * @param b second integerset in comparison
     * @return true if 2 sets are equal otherwise false
     */
    public boolean equals(IntegerSet b) {
        return this.set.equals(b.getSet());
    }
    
    /**
     * checks the set to see if a value is in it
     * @param value is an integer
     * @return true if the set contains value otherwise false.
     */
    
    // Returns true if the set contains the value, false otherwise
    public boolean contains(int value) {
        return this.set.contains(value);
    }
    
    /**
     * Checks if the set is empty
     * @return true if set is empty, otherwise false.
     */
    // Return true if the set is empty, false otherwise
    boolean isEmpty() {
        return this.length() == 0;
    }
    /**
     * finds the largest number in the set
     * @return largest number in set
     * @throws IntegerSetException that the set is empty
     */
    // Returns the largest item in the set; Throws a IntegerSetException if set is empty
    public int largest() throws IntegerSetException {
        if (this.isEmpty()) {
            throw new IntegerSetException("Set is empty!");
        }
        
        int largest = this.set.get(0);
        
        for (int i = 1; i < this.length(); i++) {
            if (this.set.get(i) > largest) {
                largest = this.set.get(i);
            }
        }
        
        return largest;
    }
    
    /**
     * finds the smallest number in the set
     * @return smallest number in set
     * @throws IntegerSetException that the set is empty
     */
    // Returns the smallest item in the set; Throws a IntegerSetException if set is empty
    public int smallest() throws IntegerSetException {
        if (this.isEmpty()) {
            throw new IntegerSetException("Set is empty!");
        }
        
        int smallest = this.set.get(0);
        
        for (int i = 1; i < this.length(); i++) {
            if (this.set.get(i) < smallest) {
                smallest = this.set.get(i);
            }
        }
        
        return smallest;
    }
    /**
     * adds to the set
     * @param item the number being added to the set
     */
    // Adds an item to the set or does nothing if it's already there
    public void add(int item) {
        if (!this.contains(item)) {
            this.set.add(item);
        }
    }
    /**
     * removes from the set
     * @param item the number being removed
     * @throws IntegerSetException if the set is empty
     */
    // Removes an item from the set or does nothing if it's not there
    public void remove(int item) throws IntegerSetException {
        if (this.isEmpty()) {
            throw new IntegerSetException("Set is empty!");
        }
        
        if (this.contains(item)) {
        	int index = this.set.indexOf(item);
            this.set.remove(index);
        }
    }
    /**
     * creates a union between 2 sets
     * @param intSetb the second set
     */
    // Set union
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.getSet()) {
            this.add(item);
        }
    }
    /**
     * finds the intersect between 2 sets
     * @param intSetb the second set
     */
    // Set intersection
    public void intersect(IntegerSet intSetb) {
        this.set.retainAll(intSetb.getSet());
    }
    /**
     * finds the difference between 2 sets
     * @param intSetb the second set
     */
    // Set difference
    public void difference(IntegerSet intSetb) {
    	List<Integer> nums = new ArrayList<Integer>();
    	for (int i = 0; i<this.set.size(); i++) {
    		if (intSetb.set.contains(this.set.get(i))) {
    			nums.add(this.set.get(i));
    		}
    	}
        for (int item : nums) {
        	int num = this.set.indexOf(item);
        	this.set.remove(num);
        }
    }
    /**
     * represents the set as a string
     * @return the set as a string
     */
    // String representation of the set
    public String toString() {
        
        return this.set.toString();
    }

}
