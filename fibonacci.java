import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for(int i=b; i<n; i++){
            int temp = a;
            a = b;
            b = b + temp;
            System.out.println(b);
        }
    }
}
