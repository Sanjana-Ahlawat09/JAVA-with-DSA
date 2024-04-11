package loops;
import java.util.*;
public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        
        do{
            int marks = sc.nextInt();
            if(marks>=90){
            System.out.println("this is good");
             }else if(marks<=89 && marks>=60){
              System.out.println("this is also good");
           }else if(marks<=59 && marks>=0){
            System.out.println("this is not good");
            }
           input = sc.nextInt();
        }while(input==1);

        }

    }

