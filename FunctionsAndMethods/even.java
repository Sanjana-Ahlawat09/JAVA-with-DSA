import java.util.Scanner;
public class even {

    public static void tab(int n){
    //     if(n%2==0){
    //         System.out.println("even");
    //     }else{
    //         System.out.println("odd");
    //     }
    // }

    for(int i=0;i<=10;i++){
      int mul = n*i;
      System.out.println(mul);
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tab(n);
    }
}
