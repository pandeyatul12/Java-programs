import java.util.Scanner;

public class Calci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String op = sc.next();
        calciFun(a,b,op);
    }

    public static void calciFun(int a,int b, String op){
        switch(op){
            case ("+"): {
            System.out.println(a+b);
            break;
            }
            case ("-"): {
            System.out.println(a-b);
            break;
            }
            case ("*"): {
            System.out.println(a*b);
            break;
            }
            case ("/"): {
            System.out.println(a/b);
            break;
            }

        }
    }
    
}
