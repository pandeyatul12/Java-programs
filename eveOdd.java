import java.util.Scanner;

public class eveOdd{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int a = sc.nextInt();
            if(a%2==0){
                System.out.println("Even No");
            } else System.out.println("Odd No");
        }
    }
}