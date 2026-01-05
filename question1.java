/* Question 1 : check the number is prime or not */ 

import java.util.*;

public class question1 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int no = sc.nextInt();
        int count = 0;

        if (no <= 1) {
            System.out.println("Number is not prime!");
            sc.close();
            return;
        }

        for (int divisor = 2; divisor * divisor <= no; divisor++) {
            if (no % divisor == 0) {
                count++;
                break;
            }
        }

        if (count == 0) {
            System.out.println("Number is Prime!");
        } else {
            System.out.println("Number is not prime!");
        }

        sc.close();
    }
}
