import java.util.Scanner;

public class Variable03{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("a= ");
        int a=sc.nextInt();

        System.out.print("b= ");
        int b=sc.nextInt();

        System.out.println("a+b: "+(a+b));
        System.out.println("a-b: "+(a-b));
        System.out.println("a*b: "+(a*b));
        System.out.println("a/b: "+((double)a/(double)b));

        sc.close();
    }
}