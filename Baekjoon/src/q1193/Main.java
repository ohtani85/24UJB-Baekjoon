package q1193;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        sc.close();

        int n = 1;
        while (X > n) {
            X -= n;
            n += 1;
        }

        if (n % 2 == 1) {
            System.out.println((n + 1 - X) + "/" + X);
        } else {
            System.out.println(X + "/" + (n + 1 - X));
        }
    }
}