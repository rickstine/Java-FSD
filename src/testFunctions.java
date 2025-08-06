import java.util.Scanner;

public class testFunctions {
    static int  square (int x){
        int y = x * x;
        return y;
    }
public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
System.out.println( " enter a number");
int n = sc.nextInt();
int result =testFunctions.square(n);
    System.out.println( " Square of the number " + n + " is " + result);
}
}