package q2440;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        for (int i = N; i >= 1; i--) { // ���� ������ N���� ������ 1�� �پ��
            for (int j = i; j >= 1; j--) { // ���� �ٿ� �ش��ϴ� ���� ����ŭ �� ���
                System.out.print("*");
            }
            System.out.println(); // �� �� ��� �� �ٹٲ�
        }
    }
}