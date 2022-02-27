import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int temp2 = n;
        while (n > 0) {
            int temp = n % 10;
            sum = sum + (int) Math.pow(temp, 3);
            n = n / 10;
        }
        if(sum == temp2){
            System.out.println("yes");
        } else System.out.println("No");
    }

}
