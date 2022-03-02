import java.util.Scanner;

public class maxF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int a = sc.nextInt();
        func (a,b);
    }

    public static void func(int c, int d) {
        if(c>d){
            System.out.println("Max is: " +c);
        } else System.out.println("Max is: " +d);
    }
   
    
}
