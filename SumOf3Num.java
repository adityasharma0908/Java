import java.util.Scanner;
public class SumOf3Num {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 Number");
        int a = sc.nextInt();
        System.out.println("Enter 2 number");
        int b= sc.nextInt();
        System.out.println("Enter 3 number");
        int c = sc.nextInt();
        int sum= a+b+c;
        System.out.println("Sum of 3 numbers= "+sum);
    }
}
