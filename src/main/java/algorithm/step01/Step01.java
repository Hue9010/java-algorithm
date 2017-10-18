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
			count += findPrimeNumber(Integer.parseInt(numbers[i]));
		}
		return count;
	}

	public static int findPrimeNumber(int number) {
		if (number == 1) {
			return 0;
		}
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return 0;
			}
		}
		return 1;
	}
}
