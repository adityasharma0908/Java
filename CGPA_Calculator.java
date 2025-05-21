import java.util.Scanner;
public class CGPA_Calculator {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Grades");
        System.out.println("Grades of Maths:");
        float a = sc.nextFloat();
        System.out.println("Grades of Physics:");
        float b= sc.nextFloat();
        System.out.println("Grades of Java:");
        float c= sc.nextFloat();
        float d= a+b+c;
        float CGPA= d/30;

        //Question 2
        Scanner name = new Scanner(System.in);
        System.out.println("Enter your name");
        String str= name.nextLine();
        System.out.println("Hello " +str+ " your CGPA is: " +CGPA);

        //Question 3
        Scanner km= new Scanner(System.in);
        System.out.println("Enter the distance from college to your house(in kms): ");
        float dist= km.nextFloat();
        double miles = dist*0.621371;
        System.out.println("Distance in mile= " +miles+" miles");

        //Question 4
        System.out.println("Enter the number: ");
        Scanner dd = new Scanner(System.in);
        System.out.println("Value is integer? " +dd.hasNextInt());
    }
}


