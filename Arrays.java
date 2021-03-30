
/* Christy Park ITSS 3311 09/13/20
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Arrays {
	public static void main(String[] args) {
			// Create scanner object
			System.out.print(" Enter an integer: ");
			Scanner scanner = new Scanner(System.in);
			int limit = scanner.nextInt(); 
			scanner.close();
			// Using the ArrayList class, we store the numbers
			List<Integer> listOfValidNumbers = new ArrayList<>();

				// for loop up to the user defined integer
				for (int i = 0; i <= limit; i++) {
					// modulo sign extracts the last digit
					int remainder = i % 10;
					// if the last digit is 3 or 1
					if (remainder == 3 || remainder == 1) {
						listOfValidNumbers.add(i); 
					}
				}

				// largest arraylist here
			List<Integer> largestFirst = new ArrayList<>();
			
			for (int i = 0; i < 1; i++ ) {
					System.out.print("All the numbers lower than " + limit + " and composed with digits 1 and/or 3: ");

			}
				// looping over the previous arraylist backwards
			for (int i = listOfValidNumbers.size() - 1 ; i >= 0; i--) {
			largestFirst.add(listOfValidNumbers.get(i)); // getting the last item of the list
		}

				// for each value in the largestFirst array
			for (int i = 0; i <= largestFirst.size() - 1 ; i++) {
				// if the last item is present do not add comma
				if (largestFirst.get(i) == largestFirst.get(largestFirst.size() - 1)) {
					System.out.print(largestFirst.get(i));
					}
				// else add comma
				else {
					System.out.print(largestFirst.get(i) + ", ");
				}
			}
		}
	}
			
