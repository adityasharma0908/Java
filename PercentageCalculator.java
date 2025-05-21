import java.util.Scanner;
public class PercentageCalculator {
    public static void main(String[] args){
        float total=500;
        System.out.println("Taking input fom the user");
        Scanner sc= new Scanner(System.in);
        System.out.println("Marks of S1=");
        float a = sc.nextFloat();
        System.out.println("Marks of S2=");
        float b = sc.nextFloat();
        System.out.println("Marks of S3=");
        float c = sc.nextFloat();
        System.out.println("Marks of S4");
        float d = sc.nextFloat();
        System.out.println("Marks of S5=");
        float e = sc.nextFloat();
        float sum = a+b+c+d+e;
        float M = (sum/total)*100;
        System.out.println("Percentage = " +M+ "%");
    }
}