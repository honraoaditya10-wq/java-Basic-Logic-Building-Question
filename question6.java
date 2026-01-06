/* Question 6 : Print reverse Number */ 


import java.util.*;

public class question6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no : ");
        int no = sc.nextInt();

        while(no != 0){
            int digit = no % 10;
            System.out.println(digit);
            no = no / 10;
        }

    }
}