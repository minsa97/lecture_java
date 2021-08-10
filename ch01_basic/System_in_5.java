import java.util.Scanner;

public class System_in_5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("a= ");
        int a=sc.nextInt();

        System.out.print("b= ");
        int b=sc.nextInt();

        System.out.print("c= ");
        int c=sc.nextInt();

        System.out.println("add: "+(a+b+c));
        System.out.println("mul: "+(a*b*c));

        sc.close();
    }
}