package org.howard.edu.lsp.midterm.problem2;

public class Person {
	
		private String name; 
		private int age; 
		private String socialSecurityNumber;

			public Person(String name,  String socialSecurityNumber, int age) {
				// initialize private variables
				name = name;
				age = age;
				socialSecurityNumber = socialSecurityNumber;
			}
		public String toString()
		{	Integer num = age;
			String ageString =  num.toString();
			String person = name + ", " + ageString + ", " + socialSecurityNumber;
			return person;
			
		}
		public boolean equals(Object person2 ) {
			if (person2 instanceof Person) {
				Person Person2 = (Person) person2;
				if (socialSecurityNumber == Person2.socialSecurityNumber) {
					return true;
				}
				
				
			}
			
			return false;
			
		}
}
