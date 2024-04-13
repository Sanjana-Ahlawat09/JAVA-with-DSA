package FunctionsAndMethod;
import java.*;
import java.util.Scanner;
public class function{
    public static void printNyName(String name){
      System.out.println(name);
      return;
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    printNyName(name);
    }
}