package q9012;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt(); // �׽�Ʈ ���̽��� ��
		scanner.nextLine(); // ���� �Է� �� ���� �ٹٲ� ���� ����

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

	// �ùٸ� ��ȣ ���ڿ����� Ȯ���ϴ� �޼ҵ�
	public static boolean isValidParenthesis(String s) {
		int balance = 0; // ��ȣ�� ������ ��Ÿ���� ����

		for (char c : s.toCharArray()) {
			if (c == '(') {
				balance++;
			} else if (c == ')') {
				if (balance == 0) {
					return false; // �ݴ� ��ȣ�� �� ������ ��� �ٷ� false ��ȯ
				}
				balance--;
			}
		}

		return balance == 0; // ��� �˻� �� balance�� 0�̸� �ùٸ� ��ȣ ���ڿ�
	}
}
