package q2440;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        for (int i = N; i >= 1; i--) { // 별의 개수가 N에서 시작해 1씩 줄어듬
            for (int j = i; j >= 1; j--) { // 현재 줄에 해당하는 별의 수만큼 별 출력
                System.out.print("*");
            }
            System.out.println(); // 한 줄 출력 후 줄바꿈
        }
    }
}