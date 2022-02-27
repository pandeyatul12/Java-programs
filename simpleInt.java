import java.util.Scanner;

public class simpleInt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle ");
        int p = sc.nextInt();
        System.out.print("Enter Rate ");
        int r = sc.nextInt();
        System.out.print("Enter Time ");
        int t = sc.nextInt();
        int si = (p*r*t)/100;
        System.out.println("The Simple Interest is: "+ si);
    }
}
