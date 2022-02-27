import java.util.Scanner;

public class swapNos {
    public static void main(String[] main){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.print(a + "," + b);
    }
    
}
