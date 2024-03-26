package q2438;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 사용자로부터 N 값 입력 받기
		sc.close();

		for (int i = 1; i <= N; i++) { // 1부터 N까지 반복
			for (int j = 1; j <= i; j++) { // 각 줄마다 별의 개수를 증가시키면서 출력
				System.out.print("*");
			}
			System.out.println(); // 한 줄에 해당하는 별을 모두 찍고 나면 줄바꿈
		}
	}
}
