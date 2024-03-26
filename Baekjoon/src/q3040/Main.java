package q3040;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int[] hat = new int[9];
        int total = 0;

        // 아홉 난쟁이의 모자에 쓰인 숫자 입력 받기
        for (int i = 0; i < 9; i++) {
        	hat[i] = sc.nextInt();
            total += hat[i];
        }

        // 두 난쟁이를 찾기
        outerLoop:
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (total - hat[i] - hat[j] == 100) {
                	hat[i] = hat[j] = 0; // 두 난쟁이를 제외하기 위해 0으로 설정
                    break outerLoop;
                }
            }
        }

        // 일곱 난쟁이 출력
        for (int i = 0; i < 9; i++) {
            if (hat[i] != 0) {
                System.out.println(hat[i]);
            }
        }
	}
}





//	int[] hat = new int[9];for(
//	int i = 0;i<hat.length;i++)
//	{
//		hat[i] = sc.nextInt();
//	}sc.close();
//
//	// print
//	for(
//	int i = 0;i<hat.length;i++)
//	{
//
//	}
//
//	// 9개의 수 합을 구하기
//	int sum = 0;for(
//	int i = 0;i<hat.length;i++)
//	{
//		sum += hat[i];
//	}
//
//	// 합계에서 제외 할 2개의 수를 선정
//	int ai = -1, aj = -1;for(
//	int i = 0;i<hat.length;i++)
//	{
//		for (int j = 0; j < hat.length; j++) {
//			if (i != j) {
//
//				if ((sum - (hat[i] + hat[j]) == 100)) {
//					ai = i;
//					aj = j;
//					break;
//				}
//			}
//		}
//	}
//
//	for(
//	int k = 0;k<hat.length;k++)
//	{
//		if (k != ai && k != aj)
//			System.out.println(hat[k]);
//		}
//	}
//}