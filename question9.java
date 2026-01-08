/*Find and print the GCD and LCM of two given numbers.*/

import java.util.Scanner;

public class Main {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int g = gcd(num1, num2);
        long l = (long) num1 * num2 / g;

        System.out.println(g);
        System.out.println(l);
    }
}
