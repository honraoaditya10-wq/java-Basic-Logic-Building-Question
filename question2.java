/* Question 2 : Print all prime number between a particular range */ 

import java.util.*;

public class Question2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int low, high;

        System.out.print("Enter Starting number : ");
        low = sc.nextInt();

        System.out.print("Enter Ending number : ");
        high = sc.nextInt();

        for (int i = low; i <= high; i++) {

            if (i <= 1) {
                continue;
            }

            int count = 0;

            for (int divisor = 2; divisor * divisor <= i; divisor++) {
                if (i % divisor == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
