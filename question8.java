/* Question 8 : Rotate a Number */

import java.util.*;

public class question8{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Number :");
        int no = sc.nextInt();
        System.out.print("Enter Number to Rotate : ");
        int ro_no = sc.nextInt();

        int temp = no;
        int count = 0;
        
        while (temp > 0){
            temp = temp/10;
            count++;
        }

        ro_no = ro_no % count;
        if(ro_no < 0){
            ro_no = ro_no + count;
        }
        int div = 1;
        int mul = 1;

        for(int i=1; i<=count; i++){
            if(i<=ro_no){
                div = div * 10;
            }
            else{
                mul = mul * 10;
            }
        }

        int q = no / div;
        int r = no % div;

        int rotate_no = r * mul + q;

        System.out.println(rotate_no);
    }
}