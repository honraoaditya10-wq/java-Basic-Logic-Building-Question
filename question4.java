/* Question 4 : count number of digits */ 

import java.util.*;

public class question4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int no;
        System.out.print("Enter a Number : ");
        no = sc.nextInt();

   
        int count = 0;
    
        while( no != 0){
            no = no / 10;
            count++;
        }
        System.out.println(count);
    }
}