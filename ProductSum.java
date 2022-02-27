import java.util.Scanner;

public class ProductSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int pro = 1;
        while(n>0){
        int temp2 = n%10;
        n = n/10;
        sum = sum + temp2;
        pro = pro * temp2;
    }
    System.out.println("Sum is " + sum );
    System.out.println("Product is " + pro);
}
    
}
