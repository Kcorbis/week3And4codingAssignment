package week3coding;

public class AssignmentWeek3 {

	public static void main(String[] args) {
		/*1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array 
		(i.e. do not use ages[7] in your code). Print the result to the console.  
		b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		
		*/
		
		int[] ages = {3,9,23,64,2,8,28,93,101};
		
		System.out.println( ages[ages.length-1] - ages[0]);
		
		double ageTotal = 0;
		for (int age : ages) {
		ageTotal += age;	
		}
		System.out.println(ageTotal/(ages.length));
		
		/*
		2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		b.	Use a loop to iterate through the array again and concatenate all the names together, 
		separated by spaces, and print the result to the console. */
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		double sumOfNames = 0;
		
		for (int i = 0; i < names.length; i++) {
			sumOfNames += names[i].length();
					}
		System.out.println(sumOfNames / names.length);
		/*
		3.	How do you access the last element of any array?
			
			ANSWER: array[array.length-1];
		
		4.	How do you access the first element of any array?
		
			ANSWER: array[0];
		*/	
		/*
		5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously 
			created names array and add the length of each name to the nameLengths array.*/
		
		int[] nameLengths = new int[names.length];
		 for (int i = 0; i < names.length; i++) {
		 nameLengths[i] = names[i].length();
		 }
		/*
		6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		*/
		 
		 double sumOfNameArray = 0;
		 
		 for (int name:nameLengths) {
		sumOfNameArray+=name;
				 }
		 System.out.println(sumOfNameArray);} 
		
		 
		 
		 /*
					
		
		
		}
	
	 /*
	7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	*/
	public static String concat(String word, int n) {
		String longWord = "";
		for (int i = 0; i < n; i++) {
			longWord += word;
		}
		return longWord;

	}
	//8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;

	}
	
	//9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	public static boolean isGreaterThan(int[] arr) {
		int sumOfArray = 0;
		for (int nums : arr) {
		sumOfArray += nums;	
		}
		if (sumOfArray > 100) {
					}
		return true;
		
	}
	
	//10.	Write a method that takes an array of double and returns the average of all the elements in the array.
	
	public static double doubleAvg(double[] array) {
		double sum = 0;
		for (double number : array) {
			sum += number;
		}
		return sum / array.length;
	}
	
	//11.	Write a method that takes two arrays of double and returns true if the average of the elements in the first array 
	//      is greater than the average of the elements in the second array.
	
	public static boolean firstAvgGreatger(double[] arrayOne, double [] arrayTwo) {
		double sumOne = 0;
		double sumTwo = 0;
		double avgOne = 0;
		double avgTwo = 0;
		for (double numberOne : arrayOne) {
			sumOne += numberOne;
			avgOne = sumOne / arrayOne.length;
			
		}
		for (double numberTwo: arrayTwo) {
			sumTwo += numberTwo;
			avgTwo += sumTwo / arrayTwo.length;
		}
		return avgOne > avgTwo;
	}
	
	//12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
	//		and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		
		if (isHotOutside = true && moneyInPocket > 10.50) {
			return true;
		}
		return false;
	}
	
	//13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it. */
	
	public static String goBills(int billsScore, int opponentScore) {
		if (billsScore > opponentScore) {
			return "GO BILLS!  Bills win by " + (billsScore - opponentScore);
		} 
			System.out.println("BOO... Bills lose by " + (opponentScore - billsScore));
		
		return "BOO... Bills lose by " + (opponentScore - billsScore);
	} //I made this method to determine if the Buffalo Bills won or lost and by how many points.  
}
