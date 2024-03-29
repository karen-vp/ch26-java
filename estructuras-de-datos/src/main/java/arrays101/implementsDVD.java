package arrays101;

public class implementsDVD {

	public static void main(String[] args) {
		
		// The actual code for creating an Array to hold DVD's.
		DVD[] dvdCollection = new DVD[15];
		
		// Firstly, we need to actually create a DVD object for The Avengers.
		DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");

		// Next, we'll put it into the 8th place of the Array. Remember, because we
		// started numbering from 0, the index we want is 7.
		dvdCollection[7] = avengersDVD;
		
		DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
		DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
		DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");

		// Put "The Incredibles" into the 4th place: index 3.
		dvdCollection[3] = incrediblesDVD;

		// Put "Finding Dory" into the 10th place: index 9.
		dvdCollection[9] = findingDoryDVD;

		// Put "The Lion King" into the 3rd place: index 2.
		dvdCollection[2] = lionKingDVD;
		// Because we just put Star Wars into the Array at index 3, 
		// The Incredibles is no longer in the Array. It has been overwritten!
		// If we still have the incrediblesDVD variable in scope, then the DVD 
		// still exists in the computer's memory. If not though, it's totally gone!
		DVD starWarsDVD = new DVD("Star Wars", 1977, "George Lucas");
		dvdCollection[3] = starWarsDVD;
		
		// Print out what's in indexes 7, 10, and 3.
		System.out.println(dvdCollection[7]);
		System.out.println(dvdCollection[10]);
		System.out.println(dvdCollection[3]);

		// Will print:

		// The Avengers, directed by Joss Whedon, released in 2012
		// null
		// Star Wars, directed by George Lucas, released in 1977
	}

}
