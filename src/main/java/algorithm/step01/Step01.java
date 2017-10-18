package algorithm.step01;

public class Step01 {

	public static int solution(String str) {
		String[] strArr = str.split("\n");
		String[] numbers = strArr[1].split(" ");
		int count = 0;
		for (int i = 0; i < Integer.parseInt(strArr[0]); i++) {
			count += checkPrimeNumber(Integer.parseInt(numbers[i]), 2);
		}
		return count;
	}

	public static int checkPrimeNumber(int number, int divisionNumber) {
		return number == 1 ?
				0 : number / 2 < divisionNumber ?
						1 : number % divisionNumber == 0 ? 
								0 : checkPrimeNumber(number, divisionNumber + 1);
	}
}
