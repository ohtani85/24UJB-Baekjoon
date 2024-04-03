package q2884;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt(); // 시간 입력
		int M = sc.nextInt(); // 분 입력

		// 알람 시간에서 45분 뺌
		M -= 45;

		// 만약 분이 0보다 작아지면, 한 시간을 빼고 분에 60을 더한다
		if (M < 0) {
			M += 60;
			H -= 1;

			// 만약 시간이 0보다 작아지면, 23시로 변경한다
			if (H < 0) {
				H = 23;
			}
		}

		// 새로운 알람 시간 출력
		System.out.println(H + " " + M);

		sc.close();
	}
}