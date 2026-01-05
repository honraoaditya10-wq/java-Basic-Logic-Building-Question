/* Question  : Print number of digits */ 

import java.util.*;

public class question4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int no;
        System.out.print("Enter a Number : ");
        no = sc.nextInt();

        int count = 0;
        int temp = no;
    
        while( temp != 0){
            temp = temp / 10;
            count++;
        }
        
        int divisor = (int )Math.pow(10, count - 1);

        while(divisor > 0){
           int digite = no / divisor;
            System.out.println(digite);
            no = no % divisor;
            divisor = divisor/10; 
        }

        System.out.print(no);

        

    }
}