/* Question 3 : Print all Fibonacci series till n */ 
import java.util.*;

public class question3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int no = sc.nextInt();
        int a=0;
        int b=1;

            System.out.println(a);
            System.out.println(b);

        int next;
        for(int i=0; i<=no; i++){
           next = a + b; 
           System.out.println(next);  
           a=b; 
           b=next;  
       
        }
    }
}