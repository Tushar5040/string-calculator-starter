package calculator;

import java.util.Scanner;

class StringCalculator {

	public int add(String inputString) throws Exception {
		String[] arrOfNumber;
		int result = 0;
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

					arrOfNumber = inputString.split(",");

					int negvallcount = 0;
					for (String Number : arrOfNumber) {

						if (Integer.parseInt(Number) > 1000) {
							Number = String.valueOf(0);

						} else if (Integer.parseInt(Number) < 0 && negvallcount >= 0) {

							negvallcount++;

						}

						result = result + Integer.parseInt(Number);

					}

					if (negvallcount >= 1) {

						throw (new Exception(
								"Exception string is less than 0 please input sting with positive numbers"));
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