package q9012;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt(); // 테스트 케이스의 수
		scanner.nextLine(); // 정수 입력 후 남은 줄바꿈 문자 제거

		for (int i = 0; i < T; i++) {
			String s = scanner.nextLine();
			if (isValidParenthesis(s)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		scanner.close();
	}

	// 올바른 괄호 문자열인지 확인하는 메소드
	public static boolean isValidParenthesis(String s) {
		int balance = 0; // 괄호의 균형을 나타내는 변수

		for (char c : s.toCharArray()) {
			if (c == '(') {
				balance++;
			} else if (c == ')') {
				if (balance == 0) {
					return false; // 닫는 괄호가 더 많아질 경우 바로 false 반환
				}
				balance--;
			}
		}

		return balance == 0; // 모든 검사 후 balance가 0이면 올바른 괄호 문자열
	}
}
