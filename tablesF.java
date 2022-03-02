import java.util.Scanner;

public class tablesF {
       public static void main(String[] args){
           Scanner sc = new Scanner(System.in);
           int table = sc.nextInt();
           tableFun(table);
       } 

       public static void tableFun(int num){
        for(int i= 1; i<=10; i++){
            System.out.print(num*i + " ");
        }
       }
}
