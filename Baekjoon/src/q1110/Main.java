package q1110;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.close();

        int cycleLength = 0;
        int originalNumber = N;

        do {
            N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
            cycleLength++;
        } while (originalNumber != N);

        System.out.println(cycleLength);
    }
}