package q2441;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        for (int i = N; i >= 1; i--) {
            // 먼저 공백 출력
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            // 그 다음 별 출력
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            // 줄바꿈으로 각 줄을 구분
            System.out.println();
        }
    }
}