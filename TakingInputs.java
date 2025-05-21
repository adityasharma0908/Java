import java.util.Scanner;
public class TakingInputs {
    public static void main(String[] args){
        System.out.println("Taking input from user");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first value");
        int a=sc.nextInt();
        System.out.println("Enter the second value");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("sum of " +a+ " and " +b+ " is =" +sum);
    }
}
