/*Question 7 : Find the Inverse of the number*/

import java.util.*;

public class question7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int no = sc.nextInt();

        int inv = 0;
        int op = 1;

        while(no!=0){
            int od = no % 10;

            int ip = od;
            int id = op;

            inv = inv + id * (int)Math.pow(10,ip-1);

            no = no/10;
            op++;
        }

        System.out.print(inv);
        
    }
}