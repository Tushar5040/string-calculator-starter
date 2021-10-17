package calculator;

import java.util.ArrayList;
import java.util.Scanner;

class StringCalculator {

	public int add(String inputString) throws Exception {
		String[] arrOfNumber;
		int result = 0;
		String delimeter = ",|\\\\n";
		ArrayList<Integer>negativeNumber = new ArrayList<Integer>();
		String negativeNumbers=" ";
		if (inputString.startsWith("//")|| inputString.contains("//")) {
			
			
			
			
			delimeter = String.valueOf(inputString.split("\\\\n")[0].replaceAll("[/]", ""));
			inputString = String.valueOf(inputString.split("\\\\n")[1]);
			

			System.out.println(inputString);
			System.out.println(delimeter);

		}
		
		
		
		
		if (inputString.endsWith("\\n")) {
			System.out.println("Invalid Input, No character after Delimiter");

		}
		if (inputString.isEmpty()) {
			return 0;
		} else {
			if (inputString.length() > 0) {
				if (inputString.length() == 1) {
					try {
						int num = Integer.parseInt(inputString);
						return num;
					} catch (Exception e) {

						System.out.println("string is not numeric");

					}

				} else {

					
					arrOfNumber = inputString.split(delimeter);
					int negvallcount = 0;
					for (String Number : arrOfNumber) {

						if (Integer.parseInt(Number) > 1000) {
							Number = String.valueOf(0);

						} else if (Integer.parseInt(Number) < 0 && negvallcount >= 0) {
							
							negativeNumber.add(Integer.parseInt(Number));
							
							negvallcount++;

						}

						result = result + Integer.parseInt(Number);

					}

					if (negvallcount >= 1) {
						for (Integer integer : negativeNumber) {
							System.out.println(integer);
						}				
						throw (new Exception(
								"Exception occured input has -ve number.Provide positive numbers for given numbers:"+negativeNumbers ));
					
					}
					return result;
				}
			}

			return 1;
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("plz input string of Number");

		String stringOfNumbers = scan.nextLine();
		StringCalculator calculator = new StringCalculator();

		try {
			int result = calculator.add(stringOfNumbers);
			System.out.println("result " + result);
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}
}