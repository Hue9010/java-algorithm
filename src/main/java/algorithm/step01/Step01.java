package algorithm.step01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
		if (number == 1) {
			return 0;
		}
		if (number / 2 < divisionNumber) {
			return 1;
		}
		return number % divisionNumber == 0 ? 0 : checkPrimeNumber(number, divisionNumber + 1);
	}
}
